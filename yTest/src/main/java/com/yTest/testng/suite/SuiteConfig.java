package com.yTest.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite
    public  void beforeSuite(){
        System.out.println(" before suite 运行了");
    }

    @AfterSuite
    public  void afterSuite(){
        System.out.println(" after suite 运行结束");
    }

    @BeforeTest
    public  void beforeTest(){
        System.out.println("before test");
    }

    @AfterTest
    public  void afterTest(){
        System.out.println("After test");
    }
}
