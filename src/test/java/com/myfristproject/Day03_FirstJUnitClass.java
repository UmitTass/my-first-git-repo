package com.myfristproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Day03_FirstJUnitClass {

        /*
         * *****JUNIT*****
         * Junit is a testing framework
         * Testers can use Junit for creating automation framework
         * Devs can use Junit for creating Unit test framework
         *
         * *****ANNOTATIONS******
         * There are 7 annotations
         * 1. @Test -> marks a method as a TEST CASE
         * All test methods are VOID
         * B/C (because) we create test cases for assertion, not to return a value
         * We no longer need main method for Creating or Running test cases
         * We can run test methods form the method level or class level
         *
         * 2. @Before : Runs before EACH @Test annotation
         *
         * */


    @Before
    public void setUp (){System.out.println("BEFORE METHOD");
    }

    @After
    public void tearDown (){

        System.out.println("AFTER METHOD");
    }




    @Test
        public void test1(){
            System.out.println("This is Test 1");
        }
    @Test
    public void test2(){
        System.out.println("This is Test 2");
    }
    @Test
    public void test3(){
        System.out.println("This is Test 3");
    }
    @Ignore
    @Test
    public void test4(){
        System.out.println("This is Test 4");
    }
}
