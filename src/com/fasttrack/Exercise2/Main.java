package com.fasttrack.Exercise2;

import com.fasttrack.Exercise1.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Cipri", 34, true);
        Person person2 = new Person("Mircea", 19, false);
        Person person3 = new Person("Ana", 46, true);

        System.out.println("\n" + person1);
        System.out.println("\n" + person2);
        System.out.println("\n" + person3);

    }
}