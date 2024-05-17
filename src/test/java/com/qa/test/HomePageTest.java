package com.qa.test;

import com.pages.HomePage;
import com.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{
    @Test(priority = 1)
    public void homePageTitleTest(){
        page.getInstance(LoginPage.class).doLogin("Admin","admin123");
        String dashboardMenu=page.getInstance(HomePage.class).getDashboardMenu();
        System.out.println("Home Page Header is: "+ dashboardMenu);
        Assert.assertEquals(dashboardMenu,"Dashboard");
    }
    @Test(priority = 2)
    public void verifyUserName(){

    }
}
