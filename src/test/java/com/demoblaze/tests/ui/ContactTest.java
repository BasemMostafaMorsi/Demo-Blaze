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

public class ContactTest extends BaseTest {

    @Test
    public void contactUsForm(){
     new NavigationBarComponents(driver)
             .clickContactButton()
               .newMessage(
                testData.getJsonData("email"),
                testData.getJsonData("name"),
                testData.getJsonData("message")
     ).clickSendMessageButton();
     alertActions.acceptAlert();
    }


    @BeforeClass
    protected void preCondition() {
        testData = new JsonReader("contact-data");
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
