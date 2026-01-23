package com.demoBlaze.pages;


import com.demoBlaze.drivers.GUIDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage {
    private final GUIDriver driver;
    public LoginPage(GUIDriver driver1) {
        this.driver = driver1;
    }

    private By userName = By.id("loginusername");
    private By password = By.id("loginpassword");
    private By loginButton = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    private By closeButton = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[1]");
    //actions
    @Step("login use name and password")
    public LoginPage login(String name , String pass){
        driver.element().type(userName ,name);
        driver.element().type(password ,pass);
        return this;
    }
    @Step("click on login Button")
    public LoginPage clickLoginButton(){
        driver.element().click(loginButton);
        return this;
    }
    @Step("click on close Button")
    public LoginPage clickCloseButton(){
        driver.element().click(closeButton);
        return this;
    }


}
