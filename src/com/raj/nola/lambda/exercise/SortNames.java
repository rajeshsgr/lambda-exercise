package com.raj.nola.lambda.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortNames {

    public static void main(String[] args) {

        List<Person> objList = Arrays.asList(
                new Person("Jeremy", "Landry", 42),
                new Person("Kevin", "Dawson", 50),
                new Person("Daniel", "Dilachara", 38),
                new Person("Robert", "Russell", 45),
                new Person("Tony", "MacDade", 49)
        );

        System.out.println(objList);

        System.out.println(sortWithLambda(objList));

        System.out.println(sortWithoutLambda(objList));

    }

    public static List<Person> sortWithoutLambda(List<Person> pList) {

        Collections.sort(pList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        return pList;
    }


    public static List<Person> sortWithLambda(List<Person> pList) {

        Collections.sort(pList, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        return pList;
    }
}
