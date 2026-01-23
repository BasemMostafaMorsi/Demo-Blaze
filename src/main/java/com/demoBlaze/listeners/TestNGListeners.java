package com.demoBlaze.listeners;

import com.demoBlaze.FileUtils;
import com.demoBlaze.drivers.UITest;
import com.demoBlaze.drivers.WebDriverProvider;
import com.demoBlaze.media.ScreenRecordManager;
import com.demoBlaze.media.ScreenshotsManager;
import com.demoBlaze.utils.dataReader.PropertyReader;
import com.demoBlaze.utils.logs.LogsManager;
import com.demoBlaze.utils.report.AllureAttachmentManager;
import com.demoBlaze.utils.report.AllureConstants;
import com.demoBlaze.utils.report.AllureEnvironmentManager;
import com.demoBlaze.utils.report.AllureReportGenerator;
import com.demoBlaze.validations.Validation;
import org.openqa.selenium.WebDriver;
import org.testng.*;

import java.io.File;

public class TestNGListeners implements ISuiteListener, IExecutionListener, IInvokedMethodListener, ITestListener {
    public void onStart(ISuite suite) {
        suite.getXmlSuite().setName("Demo Blaze");
    }
    public void onExecutionStart() {
        LogsManager.info("Test Execution started");
        cleanTestOutputDirectories();
        LogsManager.info("Directories cleaned");
        createTestOutputDirectories();
        LogsManager.info("Directories created");
        PropertyReader.loadProperties();
        LogsManager.info("Properties loaded");
        AllureEnvironmentManager.setEnvironmentVariables();
        LogsManager.info("Allure environment set");
    }

    public void onExecutionFinish() {
        AllureReportGenerator.copyHistory();
        AllureReportGenerator.generateReports(true);
        AllureReportGenerator.generateReports(true);
        AllureReportGenerator.openReport(AllureReportGenerator.renameReport());
        LogsManager.info("Test Execution Finished");
    }


    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        if (method.isTestMethod()) {
            if (testResult.getInstance() instanceof UITest)
            {
                ScreenRecordManager.startRecording();
            }
            LogsManager.info("Test Case " + testResult.getName() + " started");
        }
    }

    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        WebDriver driver = null;
        if (method.isTestMethod())
        {
            if (testResult.getInstance().getClass().isAnnotationPresent(UITest.class))
            {
                ScreenRecordManager.stopRecording(testResult.getName());
                if (testResult.getInstance() instanceof WebDriverProvider provider)
                    driver = provider.getWebDriver(); //initialize driver from WebDriverProvider
                switch (testResult.getStatus()){
                    case ITestResult.SUCCESS -> ScreenshotsManager.takeFullPageScreenshot(driver,"passed-" + testResult.getName());
                    case ITestResult.FAILURE -> ScreenshotsManager.takeFullPageScreenshot(driver,"failed-" + testResult.getName());
                    case ITestResult.SKIP -> ScreenshotsManager.takeFullPageScreenshot(driver,"skipped-" + testResult.getName());
                }
                AllureAttachmentManager.attachRecords(testResult.getName());
            }

            Validation.assertAll(testResult);

            AllureAttachmentManager.attachLogs();

        }
    }


    public void onTestSuccess(ITestResult result) {
        LogsManager.info("Test Case " + result.getName() + " passed");
    }

    public void onTestFailure(ITestResult result) {
        LogsManager.info("Test Case " + result.getName() + " failed");
    }

    public void onTestSkipped(ITestResult result) {
        LogsManager.info("Test Case " + result.getName() + " skipped");
    }


    // cleaning and creating dirs (logs, screenshots, recordings,allure-results)
    private void cleanTestOutputDirectories() {
        // Implement logic to clean test output directories
        FileUtils.cleanDirectory(AllureConstants.RESULTS_FOLDER.toFile());
        FileUtils.cleanDirectory(new File(ScreenshotsManager.SCREENSHOTS_PATH));
        FileUtils.cleanDirectory(new File(ScreenRecordManager.RECORDINGS_PATH));
        FileUtils.cleanDirectory(new File("src/test/resources/downloads/"));
        FileUtils.forceDelete(new File(LogsManager.LOGS_PATH +"logs.log"));
    }

    private void createTestOutputDirectories() {
        // Implement logic to create test output directories
        FileUtils.createDirectory(ScreenshotsManager.SCREENSHOTS_PATH);
        FileUtils.createDirectory(ScreenRecordManager.RECORDINGS_PATH);
        FileUtils.createDirectory("src/test/resources/downloads/");

    }
}