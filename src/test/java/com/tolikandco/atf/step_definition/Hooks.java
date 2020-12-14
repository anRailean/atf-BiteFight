package com.tolikandco.atf.step_definition;

import com.tolikandco.atf.util.PropertyConfigurator;
import com.tolikandco.atf.util.driver_factory.DriverFactory;
import com.tolikandco.atf.util.driver_factory.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;


public class Hooks {

    public static WebDriver driver;
    private DriverManager driverManager;


    @Before
    public void before() {
        driverManager = DriverFactory.getManager(
                PropertyConfigurator.getProperty("BROWSER")
        );
        driver = driverManager.getDriver();
        driver.get(
                PropertyConfigurator.getProperty("URL")
        );
        driver.manage().window().maximize();
    }

    @After
    public void after() {
        driver.manage().deleteAllCookies();
        driverManager.quitDriver();
    }
}
