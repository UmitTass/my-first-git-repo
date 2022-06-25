package com.myfristproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_ThreadSleep {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        //Wait 5 seconds
        Thread.sleep(5000);

        driver.navigate().to("https://amazon.com/");

        //Wait 10 seconds = 10000 milliseconds

        Thread.sleep(1900);

        driver.quit();


        /* Thread sleep is a JAVA wait
           It is not coming from selenium
           It is a HARD WAIT
           That means driver will wait .... seconds
           If driver don't need to wait it will still wait
           Tester should avoid using Thread.sleep because it puts unnecessary waits

           This wait throws acceptance so add exception to method signature or use try catch
         */
    }
}
