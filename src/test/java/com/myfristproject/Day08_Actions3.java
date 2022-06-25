package com.myfristproject;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Day08_Actions3 extends TestBase {

    /*
     * We may need to scroll the pages
     * When the page is long, or element is not displayed properly b/c is at the bottom of the page
     * Then we have to scroll the page
     * With Actions class, we can scroll down, up, left, right.
     *
     */

    @Test
    public void scrollUpDown() throws InterruptedException {
        // Go to amazon
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);

        // 1. To scroll pages, we can use Actions class or Javascript Executor
        Actions actions = new Actions(driver);

        // 2. Use actions to scroll the page
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);

        // Arrow_Down: scrolling down a little bit
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(3000);



        //Scroll the page down
        // Scroll the page up

    }





}
