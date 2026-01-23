package com.demoBlaze.pages;

import com.demoBlaze.drivers.GUIDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ProductsPage {
    private final GUIDriver driver;


    //locator
    public ProductsPage(GUIDriver driver) {
        this.driver = driver;
    }

    //dynamic locator
    private final By productName (String productName){
        return By.xpath("//*[@id=\"tbodyid\"]//div[@class='col-lg-4 col-md-6 mb-4']//h4[@class='card-title']//a[.='"+productName+"']");
    }
    @Step("Navigate to Products Page")
    public ProductsPage navigate(){
        driver.browser().navigateTo("https://www.demoblaze.com/index.html");
        return this;
    }
    @Step("click on Product use {name}")
    public ProductDetailsPage clickOnProduct(String productName){
        driver.element().click(productName(productName));
        return new ProductDetailsPage(driver);
    }


}
