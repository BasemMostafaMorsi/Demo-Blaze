
package com.automationexercices.tests.ui;

import com.automationexercices.tests.BaseTest;
import com.demoBlaze.drivers.GUIDriver;
import com.demoBlaze.pages.ProductsPage;
import com.demoBlaze.pages.components.NavigationBarComponents;
import com.demoBlaze.utils.actions.AlertActions;
import com.demoBlaze.utils.dataReader.JsonReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductDetailsTest extends BaseTest {

    @Test
    public void productDetails(){
        new ProductsPage(driver)
                .navigate()
                .clickOnProduct(testData.getJsonData("productName"))
//                .validateProductDetails(
//                        "Samsung galaxy s6",
//                        "$360 "
//
//                )
                .clickOnAddToCartButton();
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
