package com.juwlz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    private Person person = new Person("Julius", 38);
    private int expectedAge;
    private String expectedReverseName;
    private String expectedName;
    private int actualAge;
    private String actualName;
    private String actualReverseName;


    @Test
    public void getName() {
        System.out.println("getName");
        expectedName = "Julius";
        actualName = person.getName();
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void setName() {
        System.out.println("getName");
        expectedName = "Julius";
        actualName = person.getName();
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void getAge() {
        System.out.println("getAge");
        expectedAge = 38;
        actualAge = person.getAge();
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void setAge() {
        System.out.println("age");
        expectedAge = 38;
        actualAge = person.getAge();
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void getReverseName() {
        System.out.println("reverseName");
        expectedReverseName = "suiluJ";
        actualReverseName = person.getReverseName();
        Assert.assertEquals(expectedReverseName, actualReverseName);
    }
}