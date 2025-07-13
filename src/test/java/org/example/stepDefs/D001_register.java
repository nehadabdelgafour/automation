//package org.example.stepDefs;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.example.pages.P001_register;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import java.time.Duration;
//
//public class D001_register {
//    P001_register register =new P001_register();
//    @Given ("user open home url")
//    public void userOpenHomeUrl(){
//        hooks.driver.get("https://app.eboutiques.com/");
//        System.out.println("URL opened");
//    }
//
//    @When("user click on login")
//    public void userClickOnlogin() {
//    register.loginBtn.click();
//    }
//
//    @Then("user click on Register Now")
//    public void userClickOnRegisterNow() {
//        register = new P001_register();
//        WebDriverWait wait = new WebDriverWait(hooks.driver, Duration.ofSeconds(10));
//
//        WebElement registerNowBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/signup']")));
//
//        wait.until(ExpectedConditions.elementToBeClickable(register.RegisterNow)).click();
//    //register.RegisterNow.click();
//    }
//}
package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P001_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class D001_register {
    P001_register register = new P001_register();
    WebDriver driver = hooks.driver;

    @Given("user open home url")
    public void userOpenHomeUrl() {
        driver.get("https://app.eboutiques.com/");
        System.out.println("✅ URL opened");
    }

    @When("user click on login")
    public void userClickOnLogin() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(register.loginBtn))
                .click();
    }

    @When("user click on Register Now")
    public void userClickOnRegisterNow() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/signup']"))).click();
    }
}

