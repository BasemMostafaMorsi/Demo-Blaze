package com.demoBlaze.pages;

import com.demoBlaze.drivers.GUIDriver;
import com.demoBlaze.utils.dataReader.PropertyReader;
import com.demoBlaze.utils.logs.LogsManager;
import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    private final GUIDriver driver;
    public CartPage( GUIDriver driver1) {
        this.driver = driver1;
    }
    private final String endPointCart = "/cart.html";

    //locators
    private final By nameProduct (String productName){
        return By.xpath("//tr[@class='success']//td[.='"+productName+"']");
    }
    private final By priceProduct (String productName){
        return By.xpath("//tr[@class='success']//td[.='"+productName+"']//following::td[1]");
    }
    private By deleteButton (String productName){
        return By.xpath("//tr[@class='success']//td[.='"+productName+"']//following::a[1]");
    }
    private By placeOrderButton = By.xpath("//div[@class='panel panel-info']//following::button");

    //actions
    public  CartPage navigation(){
        driver.browser().navigateTo(PropertyReader.getProperty("baseUrlWeb")+endPointCart);
        return this;

    }
    @Step("check is validate product")
    public CartPage validateProduct(String productName, String priceName){
//
        String actualProductName = driver.element().getText(nameProduct(productName));
        String actualProductPrice = driver.element().getText(priceProduct(productName));
        LogsManager.info("actualProductName: "+actualProductName ,"actualProductPrice: "+actualProductPrice);
        driver.validation().Equals(actualProductName,productName," Product Name is not matched");
        driver.validation().Equals(actualProductPrice,priceName," Product Price is not matched");
        return this;
    }
    @Step("click in pace order button")
    public PaceOrderPage paceOrder(){
        driver.element().click(placeOrderButton);
        return new PaceOrderPage(driver);
    }
}
