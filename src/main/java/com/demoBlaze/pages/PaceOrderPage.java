package com.demoBlaze.pages;

import com.demoBlaze.drivers.GUIDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class PaceOrderPage {
    private final GUIDriver driver;
    public PaceOrderPage( GUIDriver driver1) {

        this.driver = driver1;
    }
    private By name = By.id("name");
    private By country = By.id("country");
    private By city = By.id("city");
    private By creditCard = By.id("card");
    private By month = By.id("month");
    private By years = By.id("year");
    private By purchaseButton = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
    private By closeButton = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[1]");

    public PaceOrderPage fullPaceOrder(String name1 ,String country1 ,String city1 ,String creditCard1 ,String month1 ,String years1){
        driver.element().type(name ,name1);
        driver.element().type(country ,country1);
        driver.element().type(city ,city1);
        driver.element().type(creditCard ,creditCard1);
        driver.element().type(month ,month1);
        driver.element().type(years ,years1);
        return this;

    }
    @Step("click on purchase Button")
    public PaceOrderPage clickPurchaseButton(){
        driver.element().click(purchaseButton);
        return this;
    }
    @Step("click on close Button")
    public PaceOrderPage clickCloseButton(){
        driver.element().click(closeButton);
        return this;
    }
}
