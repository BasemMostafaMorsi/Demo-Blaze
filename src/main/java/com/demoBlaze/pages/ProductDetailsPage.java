package com.demoBlaze.pages;

import com.demoBlaze.drivers.GUIDriver;
import com.demoBlaze.pages.components.NavigationBarComponents;
import com.demoBlaze.utils.logs.LogsManager;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ProductDetailsPage{
    private final GUIDriver driver;

    public ProductDetailsPage(GUIDriver driver) {
        this.driver = driver;
    }

    private final By productName = By.cssSelector("#tbodyid > h2");

    private final By productPrice= By.xpath("//*[@id=\"tbodyid\"]/h3/text()");

    private final By addToCartButton = By.cssSelector("#tbodyid > div.row > div > a");

    //validation
    public ProductDetailsPage validateProductDetails(String Name, String Price){
        String actualProductName = driver.element().getText(productName);
        String actualProductPrice = driver.element().getText(productPrice);
        LogsManager.info("the product name is correct " + actualProductName +"the product price is correct"+actualProductPrice);
        driver.validation().Equals(actualProductName,Name , "Product name is not correct");
        driver.validation().Equals(actualProductPrice ,Price , "Product price is not correct");
        return this;
    }
    //actions
    @Step("Navigate to Product Details Page")
    public ProductDetailsPage navigation(){
        driver.browser().navigateTo("https://www.demoblaze.com/prod.html?idp_=1");
        return this;
    }
    @Step("Click on Add To Cart Button")
    public NavigationBarComponents clickOnAddToCartButton(){
        driver.element().click(addToCartButton);
        return new NavigationBarComponents(driver);
    }
}
