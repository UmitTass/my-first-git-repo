package com.myfristproject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Day07_Authentication extends TestBase {

    @Test
    public void basicAuthentication(){

        // Das werde ich wahrscheinlich nie in meinem Leben benutzen aber td gut zu wissen nebenbei.

        // driver.get("https://USERNAME:PASSWORD@URL");
        // below will type admin for username and password on the link the-internet.herokuapp.com/basic_auth
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        //        Verify teh congratulations message
        String message = driver.findElement(By.xpath("//p")).getText();

//        Assertion
        Assert.assertTrue(message.contains("Congratulations"));




    }




}
