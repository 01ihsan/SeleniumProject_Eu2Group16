package com.cydeo.test.gitHub.practice1;

import org.testng.annotations.Test;

public class LearningProperties {
     @Test
    public void java_properties(){
         System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
         System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));

     }
}
