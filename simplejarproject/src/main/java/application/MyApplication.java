package application;

import person.Gender;
import person.Person;

public class MyApplication {
    public static void main(String[] args) {
        Person person = new Person("Jos", Gender.MALE);
        System.out.println("Welcome " +person);
    }
}
