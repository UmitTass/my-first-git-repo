package com.myfristproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day02_FirefoxBrowserDemo {

    public static void main(String[] args) {
        // set path
        System.setProperty("webdriver.gecko.driver","./drivers/geckodriver");

        // set gecko driver
        WebDriver driver = new FirefoxDriver();

        // open google home page
        driver.get("https//www.google.com/");

        // Maximize the window
        driver.manage().window().maximize();

        // Close/Quit the page
        driver.quit();










    }
}
