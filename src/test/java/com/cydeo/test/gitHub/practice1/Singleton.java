package com.cydeo.test.gitHub.practice1;

public class Singleton {

    private Singleton(){}

    private static String word;

    public static String getWord(){
        if(word==null){
            System.out.println("First time call. Word object is null");
            word = "something";
        }
        else
            System.out.println("Word has a value.");
        return word;
    }
}
