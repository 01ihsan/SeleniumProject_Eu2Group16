package com.cydeo.test.gitHub.practice1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Intro {
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("method is over");
        System.out.println();
    }

    @BeforeMethod
    public void setUpMethod(){

        System.out.println("method is initializing");
    }

    @Test
    public void test1(){
        System.out.println("test1 run..");
    }
    @Test
    public void test2(){
        System.out.println("test2 run..");
        Assert.assertTrue("a".equals("a"), "title is not matching");
    }
}
