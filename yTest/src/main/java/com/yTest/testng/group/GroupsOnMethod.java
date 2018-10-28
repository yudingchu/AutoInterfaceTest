package com.yTest.testng.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void groupTest01(){
        System.out.println("服务端测试方法一");
    }

    @Test(groups = "server")
    public void groupTest02(){
        System.out.println("服务端测试方法二");
    }

    @Test(groups = "client")
    public void groupTest03(){
        System.out.println("客服端测试方法三");
    }

    @Test(groups = "client")
    public void groupTest04(){
        System.out.println("客服端测试方法四");
    }

    @BeforeGroups("server")
    public void beforeGorupServer(){
        System.out.println("服务端测试组运行之前执行");
    }

    @AfterGroups("server")
    public void afterGorupServer(){
        System.out.println("服务端测试组运行之后执行");
    }

    @BeforeGroups("client")
    public void beforeGorupClient(){
        System.out.println("客户端测试组运行之前执行");
    }

    @AfterGroups("client")
    public void afterGorupClient(){
        System.out.println("客户端测试组运行之后执行");
    }
}
