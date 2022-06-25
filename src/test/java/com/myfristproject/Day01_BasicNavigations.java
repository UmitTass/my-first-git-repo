package com.myfristproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {
    // Create a new class under: BasicNavigations
    // Create main method




    public static void main(String[] args) {


        // Set path
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

        // Create Chrome driver
        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Open google home page : https://www.google.com/.
        driver.get("https://www.google.com/");

        // On the same class navigate to amazon home page : https://amazon.com/
        /* There are two ways to go to a page
        1. get("url")
        2. navigate().to("URL")


        What is the difference between get and navigate

        1. get() is easier to use/ get() is a little faster/ get() takes only string parameter
        2. navigate has more options
         */

        driver.navigate().to("https://amazon.com/");

        // Navigate back to google
        driver.navigate().back();

        // Navigate forward to amazon
        driver.navigate().forward();

        // Refresh the page
        driver.navigate().refresh();

        // Close/Quit the page
        // What is the difference between close and quit/ both closes browser
        //close -> closes just current active browser
        //quit -> closes all browsers that is open during the test
        driver.quit();
       //  driver.close();







    }
}
