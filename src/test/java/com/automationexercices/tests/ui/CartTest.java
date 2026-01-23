package com.automationexercices.tests.ui;

import com.automationexercices.tests.BaseTest;
import com.demoBlaze.drivers.GUIDriver;
import com.demoBlaze.pages.CartPage;
import com.demoBlaze.pages.CategoriesPage;
import com.demoBlaze.pages.components.NavigationBarComponents;
import com.demoBlaze.utils.actions.AlertActions;
import com.demoBlaze.utils.dataReader.JsonReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void testCategories(){
        new CategoriesPage(driver)
                .clickOnCategory(testData.getJsonData("nameCategory"))
                .clickOnProduct(testData.getJsonData("nameLab"))
                .clickOnAddToCartButton();
        alertActions.acceptAlert();

    }
    @Test(dependsOnMethods = {"testCategories"})
    public void testCart()
    {
        new CartPage(driver).navigation()
                .navigation()
                .paceOrder()
                .fullPaceOrder(
                        testData.getJsonData("name"),
                        testData.getJsonData("country"),
                        testData.getJsonData("city"),
                        testData.getJsonData("creditCard"),
                        testData.getJsonData("month"),
                        testData.getJsonData("year")
                ).clickPurchaseButton().clickCloseButton();

    }

    @BeforeClass
    protected void preCondition() {
        testData = new JsonReader("login-data");
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
