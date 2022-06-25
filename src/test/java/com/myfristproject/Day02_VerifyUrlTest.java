package com.myfristproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyUrlTest {

    /* Navigate to google homepage
       Verify if google homepage url is "www.google.com"
     */

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to google homepage

        driver.get("https//www.google.com/");


        //  Verify if google homepage url is "www.google.com"

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "www.google.com";

        if (actualURL.equals(expectedURL)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println("Actual: " + actualURL);;
            System.out.println("Actual: " + actualURL);}


        /*
        FAILED
        "Actual: " + https//www.google.com
        "Actual: " + www.google.com

        - What do you do if test case fails
        1. Rerun your test one more time
        2. Do manual testing to make sure
        3. Contact with developer
        4. Contact with BA (Business Analyst)
        - (Check if this is a document issue (spelling,...))
        - If that is a documentation issue, then let BA fix the docs
        - And correct your test case
        5. If that is actual bug???
        - Raisa a bug ticket in jira
        - assign it to developer
        6. After dev fix the issue and deploy the code in test environment
        - Retest manually, then run your automation script
        - and close the ticket if everything is good

        NOTE: Every company has a different culture


        When you found a bug, do you fix the bug yourself
         - Nope. I document and report.





         */

    }
}
