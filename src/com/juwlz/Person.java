package com.juwlz;

public class Person {

    private String name;
    private int age;
    private int random;

    public Person(String name, int age){
        if (age < 0){
            setAge(0);
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            setAge(0);
        } else {
        this.age = age;
        }
    }

    public String getReverseName() {
        StringBuilder sb = new StringBuilder(name);
        return sb.reverse().toString();
    }
}