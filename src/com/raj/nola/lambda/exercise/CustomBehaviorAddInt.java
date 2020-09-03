package com.raj.nola.lambda.exercise;

import java.util.function.BiConsumer;

public class CustomBehaviorAddInt {

    public static void main(String[] args) {
        int [] numberArray ={2,4,6,8};

        int key=1;

        process(numberArray, key, (v, k)->System.out.println(v+k));
    }

    static void process(int [] numberArray, int key, BiConsumer<Integer, Integer> consumer){

        for( int i : numberArray){

            consumer.accept(i, key);
        }

    }
}
