package com.myfristproject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Day08_FileUploadTest extends TestBase {
    @Test
    public void fileUploadTest(){

        //When user goes to https://the-internet.herokuapp.com/upload
        driver.get("https://the-internet.herokuapp.com/upload");
        //locate Choose file input button
        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        //find the path of the file that you want to
        String filePath = "/Users/umittas21/Desktop/logo.jpeg ";
        //sendKeys(path)
        chooseFile.sendKeys(filePath);
        //click on upload button
        WebElement upload = driver.findElement(By.id("file-submit"));
        upload.click();
        //Then verify the File Uploaded!  Message displayed
        String uploadedMessage = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("File Uploaded!", uploadedMessage);
        /* AUTOMATION STEPS:
         * 1. Do Manual Testing first to understand the functionality
         *   -click on choose file
         *           - locate choose file input
         *   -select a file
         *           - use sendKeys(pathOfFile)
         *   -click upload
         *           -locate upload element and click on it
         *   -verify message : File Uploaded!
         *           -get the text of the message and do assertion
         * */
    }
}
