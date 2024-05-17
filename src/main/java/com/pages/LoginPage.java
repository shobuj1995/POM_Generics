package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    //page locator
    By userName = By.xpath("//*[@name='username']");
    By password = By.xpath("//*[@name='password']");
    By loginButton = By.xpath("//button[text()=' Login ']");

    public String getLoginPageTitle(){
        return driver.getTitle();
    }
    public void doLogin(String username,String password){
        doSendKeys(userName,username);
        doSendKeys(this.password,password);
        doClick(loginButton);
        try {
            Thread.sleep(6000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

}