package com.demoBlaze.pages;


import com.demoBlaze.drivers.GUIDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ContactPage  {
    private final GUIDriver driver;

    public ContactPage(GUIDriver driver) {
        this.driver = driver;
    }
    //locators
    private By contactEmail = By.id("recipient-email");
    private By contactName = By.id("recipient-name");
    private By message = By.id("message-text");
    private By sendMessageButton = By.xpath("//div[@class='modal-footer']//button[.='Send message']");

    //actions
    @Step("create new message")
    public ContactPage newMessage(String email , String name , String msg){
        driver.element().type(contactEmail,email);
        driver.element().type(contactName,name);
        driver.element().type(message,msg);
        return this;
    }
    @Step("click on send message button")
    public ContactPage clickSendMessageButton(){
        driver.element().click(sendMessageButton);
        return this;
    }
}
