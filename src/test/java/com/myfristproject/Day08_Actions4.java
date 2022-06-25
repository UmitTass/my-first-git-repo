package com.myfristproject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Day08_Actions4 extends TestBase {

    @Test
    public void dragAndDropTest() throws InterruptedException {

        //Given user is on https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");

        // And user moves the target element(Drag me to my target) in to  destination(Drop here)
        // We need to use Actions class to drag and drop


        // Elements are inside the iframe, so switch first
        Thread.sleep(3000);
        driver.switchTo().frame(0);

        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']")) ;

        Actions actions = new Actions(driver);
        actions.dragAndDrop(drag,drop).perform();

        /*
         * Why your test case MIGHT FAIL?
         * 1. Incorrect Locator.
         * 2. Timing. Syncronizated. - we already have enough timeout
         * 3. New Window
         * 4. JS Alerts
         * 5. IFrame
         * */
    }
}
