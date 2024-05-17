package com.qa.test;

import com.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class LoginTest extends BaseTest{
    @Test(priority = 1)
    public void verifyLoginPageTitleTest(){
        String title=page.getInstance(LoginPage.class).getLoginPageTitle();
        System.out.println("Login Page title is: "+ title);
        Assert.assertEquals(title,"OrangeHRM");
    }
    @Test(priority = 2)
    public void loginTest(){
        System.out.println("LoginTest is calling");
        page.getInstance(LoginPage.class).doLogin("Admin","admin123");
    }

}
