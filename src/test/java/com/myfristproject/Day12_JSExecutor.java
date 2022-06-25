package com.myfristproject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Day12_JSExecutor extends TestBase {


    /* What is JS Executor?
It is an API that is used to execute javascript comments in Selenium
Why you are learning javascript executor?
We may need js methods to interact with web element, when traditional selenium methods are not enough(such as click, scrolling into specific element,…)
What we can do with JS executor?
Click. Especially good with clicking hidden element
scroll onto specific elements, scroll the all the way down/up/right/left
Type in an input
Change the value of an element
Hover over
Change the color, background color, add border */


  /*  JavascriptExecutor js = (JavascriptExecutor) driver;
    Example 1: Clicking on a button
    WebElement button =driver.findElement(By.name("btnLogin"));
//Perform Click on LOGIN button using JavascriptExecutor
js.executeScript("arguments[0].click();", button);
    arguments[0] -> the first argument in executeScript method
    click() -> js function to click. It can be scrollIntoView,…
    Example 2: We will scroll down to this element
    WebElement resentBlog = driver.findElement(By.xpath("//*[.='Recent Blog']"));
js.executeScript("arguments[0].scrollIntoView(true);",resentBlog); */

    @Test
    public void jsExecutorTest() throws InterruptedException {

        driver.get("https://www.carettahotel.com/");
        Thread.sleep(3000);


        //                                              tag[@attribute='value']
        //                                              * == all, .='TEXT ON THE PAGE'
        WebElement ourRooms = driver.findElement(By.xpath("//*[.='Our Rooms']"));

        // 1. Creating js executor object
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // 2. use js executor object to add your action
        js.executeScript("arguments[0].scrollIntoView(true);",ourRooms);

        Thread.sleep(3000);
        WebElement email = driver.findElement(By.xpath("//span[.='info@carettahotel.com']"));
        js.executeScript("arguments[0].scrollIntoView(true);",email);

        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//input[@type='submit']")));


    }





}
