package com.raj.nola.lambda.exercise;

import java.util.Arrays;
import java.util.List;

public class PrintName {

    public static void main(String[] args) {

        List<Person> objList = Arrays.asList(
                new Person("Jeremy", "Landry", 42),
                new Person("Kevin", "Dawson", 50),
                new Person("Daniel", "Dilachara", 38),
                new Person("Robert", "Russell", 45),
                new Person("Tony", "MacDade", 49)
        );

        printWithoutLambda(objList);

        System.out.println("---");

        printWithLambda(objList);

    }

    static void printWithoutLambda(List<Person> personList){

        for(Person p: personList){
            System.out.println(p);
        }
    }

    static void printWithLambda(List<Person> personList){
        personList.forEach(System.out::println);
    }
}
