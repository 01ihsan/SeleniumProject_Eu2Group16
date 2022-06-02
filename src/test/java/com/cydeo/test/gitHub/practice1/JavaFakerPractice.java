package com.cydeo.test.gitHub.practice1;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.Locale;

public class JavaFakerPractice {
    @Test
    public void test1(){
        Faker faker = new Faker(new Locale("fr"));
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.funnyName().name() = " + faker.funnyName().name());
        System.out.println("faker.address() = " + faker.address().fullAddress());
        System.out.println("faker.numerify() = " + faker.numerify("541-###-##-f##"));
        System.out.println("faker.letterify() = " + faker.letterify("?A?????"));
        System.out.println("faker.bothify(\"???###\") = " + faker.bothify("5???###A"));
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact().replaceAll("Chuck Norris","Mendüş"));
    }
}
