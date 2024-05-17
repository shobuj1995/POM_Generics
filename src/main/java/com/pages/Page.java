package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
    WebDriver driver;
    WebDriverWait wait;
    //Page Constructor
    public Page(WebDriver driver,WebDriverWait wait){
        this.driver=driver;
        this.wait= wait;

    }
    public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass)
    {
        try {
            return pageClass.getDeclaredConstructor(WebDriver.class,WebDriverWait.class).newInstance(this.driver,this.wait);
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
