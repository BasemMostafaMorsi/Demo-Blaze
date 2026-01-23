package com.demoBlaze.pages.components;


import com.demoBlaze.drivers.GUIDriver;
import com.demoBlaze.pages.*;
import com.demoBlaze.utils.dataReader.PropertyReader;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class NavigationBarComponents {
    private final GUIDriver driver;

    public NavigationBarComponents(GUIDriver driver) {
        this.driver = driver;
    }
////*[@id="navbarExample"]/ul/li[1]/a
    ////*[@id="navbarExample"]/ul/li[2]/a

    private final By HomeButton = By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a");
    private final By contactButton = By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a");
    private final By AboutUsButton = By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a");
    private final By CartButton = By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a");
    private final By LoginButton = By.xpath("//*[@id=\"navbarExample\"]/ul/li[5]/a");
    private final By SignUpButton = By.xpath("//*[@id=\"navbarExample\"]/ul/li[8]/a");


    @Step("Navigate to home page")
    public NavigationBarComponents Navigation(){
        driver.browser().navigateTo(PropertyReader.getProperty("baseUrlWeb"));
        return this;
    }

    @Step("Click on Home button")
    public NavigationBarComponents clickHomeButton() {
        driver.element().click(HomeButton);
        return this;
    }

    @Step("Click on Contact button")
    public ContactPage clickContactButton() {
        driver.element().click(contactButton);
        return new ContactPage(driver);
    }
    @Step("Click on AboutUs button")
    public AboutUsPage clickOnAboutUsButton() {
        driver.element().click(AboutUsButton);
        return new AboutUsPage(driver);
    }
    @Step("click on Cart button")
    public CartPage clickOnCartButton() {
        driver.element().click(CartButton);
        return new CartPage(driver);
    }
    @Step("Click on Login button")
    public LoginPage clickOnLoginButton() {
        driver.element().click(LoginButton);
        return new LoginPage(driver);
    }
    @Step("Click on SignUp button")
    public SignUpPage clickOnSignUpButton() {
        driver.element().click(SignUpButton);
        return new SignUpPage(driver);
    }
}
