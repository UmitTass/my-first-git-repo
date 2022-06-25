package com.myfristproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;

import java.time.Duration;

public class Day06_TestBaseDemo extends TestBase {
   protected WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test
    public void test1(){
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }
    @Test
    public void test2(){
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
    }

    @After
    public void tearDown(){
        driver.quit();
    }


   /* Go to https://the-internet.herokuapp.com/javascript_alerts
    Create a class: AlertTest
    Create setUp method
    Create 3 test methods:
    acceptAlert() => click on the first alert, verify the text “I am a JS Alert” , click OK , and Verify “You successfully clicked an alert”
    dismissAlert()=> click on the second alert, verify text "I am a JS Confirm”, click cancel, and Verify “You clicked: Cancel”
    sendKeysAlert()=> click on the third alert, verify text “I am a JS prompt”, type “Hello World”, click OK, and Verify “You entered: Hello Word” */
}
