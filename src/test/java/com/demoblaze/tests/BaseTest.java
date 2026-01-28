package com.demoblaze.tests;


import com.demoBlaze.drivers.GUIDriver;
import com.demoBlaze.drivers.WebDriverProvider;
import com.demoBlaze.utils.actions.AlertActions;
import com.demoBlaze.utils.dataReader.JsonReader;
import org.openqa.selenium.WebDriver;

public class BaseTest implements WebDriverProvider {
    protected GUIDriver driver;
    protected JsonReader testData;
    protected AlertActions alertActions;





    @Override
    public WebDriver getWebDriver() {
        return driver.get();
    }
}
