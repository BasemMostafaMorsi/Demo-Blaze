package com.demoBlaze.pages;

import com.demoBlaze.drivers.GUIDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class CategoriesPage {
    private final GUIDriver driver;

    public CategoriesPage(GUIDriver driver) {
        this.driver = driver;
    }

    //dynamic locators
    private final By category(String nameCategory){
        return By.xpath("//div[@class='list-group']//a[.='"+nameCategory+"']");
    }

    private By product(String productName){
        return By.xpath("//div[@class='card h-100']//a[.='"+productName+"']");
    }

    private final By CartButton = By.xpath("//*[@id=\"navbarExample\"]/ul/li[5]/a");

    //actions

    @Step("Click on Category use {name}")
    public CategoriesPage clickOnCategory(String name){
        driver.element().click(category(name));
        return this;
    }
    @Step("Click on Product use {name}")
    public ProductDetailsPage clickOnProduct(String name){
        driver.element().click(product(name));
        return new ProductDetailsPage(driver);
    }

    @Step("click on Cart button")
    public CartPage clickOnCartButton() {
        driver.element().click(CartButton);
        return new CartPage(driver);
    }

}
