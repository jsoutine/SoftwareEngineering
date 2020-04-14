package com.juwlz;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Häst", 38);
        person.setName("Julius");
        person.setAge(-38);
        String name = person.getName();
        int age = person.getAge();
        String reverseName = person.getReverseName();

        System.out.println(age + " " + name + " " + reverseName);
    }
}
