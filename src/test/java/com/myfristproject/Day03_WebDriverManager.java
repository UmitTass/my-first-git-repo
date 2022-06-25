package com.myfristproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_WebDriverManager {

    @Test
    public void googleSearch (){
        //   Verify the google title
        //   Set Path
        //   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        //   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//windows

        // we no longer need to use System.setProperty; Instead use WebDriverManager
        // Calling and setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //Create chrome driver
        WebDriver driver = new ChromeDriver();

        // Maximize window
        driver.manage().window().maximize();

        //Open Google home page
        driver.get("https://www.google.com/");

        Assert.assertTrue(driver.getTitle().equals("Google"));

    }
}
