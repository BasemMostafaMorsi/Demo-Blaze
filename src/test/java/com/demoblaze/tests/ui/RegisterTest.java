package com.demoblaze.tests.ui;

import com.demoblaze.tests.BaseTest;
import com.demoBlaze.drivers.GUIDriver;
import com.demoBlaze.pages.components.NavigationBarComponents;
import com.demoBlaze.utils.actions.AlertActions;
import com.demoBlaze.utils.dataReader.JsonReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {


    @Test
    public void validSignUpRegister(){
        new NavigationBarComponents(driver)
                .clickOnSignUpButton()
                .enterUserName(testData.getJsonData("name"))
                .enterPassword(testData.getJsonData("password"))
                .clickSignUpButton().clickOnCloseButton();
            alertActions.acceptAlert();


    }

    @BeforeClass
    protected void preCondition() {
        testData = new JsonReader("signUp-data");
    }
    @BeforeMethod
    public void setUp() {
        driver = new GUIDriver();
        new NavigationBarComponents(driver).Navigation();
        alertActions = new AlertActions(getWebDriver());
        driver.browser().closeExtensionTab();
    }

    @AfterMethod
    public void tearDown() {
        driver.quitDriver();
    }
}
