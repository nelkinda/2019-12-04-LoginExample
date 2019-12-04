package com.nelkinda.training.login;

import at.favre.lib.crypto.bcrypt.BCrypt;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.Map;

import static java.lang.Runtime.getRuntime;

public class LoginStepDefs {
    private static WebDriver webDriver;

    static {
        System.setProperty("webdriver.gecko.driver", "./bin/geckodriver");
        final FirefoxOptions firefoxOptions = new FirefoxOptions();
        final FirefoxBinary firefoxBinary = new FirefoxBinary();
        firefoxBinary.addCommandLineOptions("--headless");
        firefoxOptions.setBinary(firefoxBinary);
        webDriver = new FirefoxDriver(firefoxOptions);
        getRuntime().addShutdownHook(new Thread(webDriver::quit));
    }

    @Given("the following users exist in the system:")
    public void the_following_users_exist_in_the_system(final Map<String, String> dataTable) {
        for (final Map.Entry<String, String> entry : dataTable.entrySet()) {
            final String username = entry.getKey();
            final String password = entry.getValue();
            final String encryptedPassword = BCrypt.with(BCrypt.Version.VERSION_BC).hashToString(4, password.toCharArray());
            // TODO
        }
    }

    @When("logging in as user {string} with password {string}")
    public void logging_in_as_user_with_password(String username, String password) {
        webDriver.navigate().to("http://localhost:9001");
        webDriver.findElement(By.id("username")).sendKeys(username);
        webDriver.findElement(By.id("password")).sendKeys(password);
    }

}
