package com.cydeo.test.gitHub.practice1;

import org.testng.annotations.Test;

public class SingletonPractice {
    @Test
    public void singletonUnderstandTest1(){
        String str1= Singleton.getWord();
        System.out.println(str1);
        String str2= Singleton.getWord();
        System.out.println(str2);
        String str3= Singleton.getWord();
        System.out.println(str3);
    }
    @Test
    public void singletonUnderstandingTest2(){
        String str4= Singleton.getWord();
        System.out.println(str4);
    }
}
