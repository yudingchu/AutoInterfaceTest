package com.yTest.testng.suite;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignore01(){
        System.out.println("ignore01 执行");
    }

    @Test(enabled = false)
    public void ignore02(){
        System.out.println("ignore02 执行");
    }

    @Test(enabled = true)
    public void ignore03(){
        System.out.println("ignore03 执行");
    }
}
