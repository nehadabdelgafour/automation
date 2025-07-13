package org.example.pages;

import org.example.stepDefs.hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P001_register {

    public P001_register(){
        PageFactory.initElements(hooks.driver,this);
    }
    @FindBy(css = "a[href=\"/login?redirect_to=%2F\"]")
    public WebElement loginBtn;
    @FindBy(css = "a[href=\"/signup\"]")
    public WebElement RegisterNow;

}


