package com.yTest.testng;

import org.testng.annotations.*;

/**
 * testng基本注解
 */
public class BasicAnnotation {

    @Test
    public void testCase01(){
        System.out.println("test01");
    }

    @BeforeMethod
    public  void beforeMethod(){
        System.out.println("beforemethod在测试用例之前运行");
    }

    @Test
    public void testCase02(){
        System.out.println("test02");
    }
    @AfterMethod
    public  void afterMethod(){
        System.out.println("aftermethod在测试用例之后运行");
    }

    @BeforeClass
    public  void beforeClass(){
        System.out.println("beforeclass在测试类运行之前执行");
    }

    @AfterClass
    public  void afterClass(){
        System.out.println("afterclass在测试类运行结束后执行");
    }

    @BeforeSuite
    public  void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public  void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }
}
