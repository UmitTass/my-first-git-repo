package com.myfristproject;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day08_FileExist {
    @Test
    public void isExistTest(){

        // Pick a file on your desktop
        // My file: logo.jpeg on the desktop
        // I will check if the file exist

        String homeDirectory = System.getProperty("user.home");
        System.out.println(homeDirectory); // /Users/umittas21

        //Path of the image
        String pathOfFile = homeDirectory+"/Desktop/logo.jpeg";
        System.out.println(pathOfFile); ///Users/umittas21/Desktop/logo.jpeg

        // And verify if that file exists on your computer or not
        boolean doesFileExist = Files.exists(Paths.get(pathOfFile));
        Assert.assertTrue(doesFileExist); // pass if exists, fails if it does not exist
         }


        @Test
        public void secondWay(){
            String filePath ="/Users/techproed/Desktop/logo.jpeg";
            boolean isFileExist = Files.exists(Paths.get(filePath));
            Assert.assertTrue(isFileExist);}

}
