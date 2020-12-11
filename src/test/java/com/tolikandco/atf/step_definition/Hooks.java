package com.tolikandco.atf.step_definition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import com.tolikandco.atf.util.driver_factory.DriverFactory;
import com.tolikandco.atf.util.driver_factory.DriverManager;

public class Hooks {

    public static WebDriver driver;
    private DriverManager driverManager;
    public static Scenario currentScenario;


    @Before
    public void before(Scenario scenario) {
        currentScenario = scenario;
        driverManager = DriverFactory.getManager("CHROME");
        driver = driverManager.getDriver();
        driver.get("https://en.bitefight.gameforge.com");
        driver.manage().window().maximize();
    }

    @After
    public void after(Scenario scenario) {
        currentScenario = scenario;
        driver.manage().deleteAllCookies();
        driverManager.quitDriver();
    }
}
