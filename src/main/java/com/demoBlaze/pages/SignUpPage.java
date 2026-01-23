package com.demoBlaze.pages;

import com.demoBlaze.drivers.GUIDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class SignUpPage {
    private final GUIDriver driver;

    public SignUpPage(GUIDriver driver) {
        this.driver = driver;
    }
    private final By userNameField = By.id("sign-username");
    private final By passwordField = By.id("sign-password");
    private final By signUpButton  = By.xpath("//div[@class='modal-footer']//button[.='Sign up']");
    private final By closeButton = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]");

    @Step("enter valid user name")
    public SignUpPage enterUserName(String userName) {
        driver.element().type(userNameField ,userName);
        return this;
    }
    @Step("enter valid password")
    public SignUpPage enterPassword(String password) {
        driver.element().type(passwordField ,password);
        return this;
    }
    @Step("click on sign up button")
    public SignUpPage clickSignUpButton() {
        driver.element().click(signUpButton);
        return this;
    }
    @Step("click on close button ")
    public SignUpPage clickOnCloseButton() {
        driver.element().click(closeButton);
        return this;

    }

}
