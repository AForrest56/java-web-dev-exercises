package org.launchcode.java.demos.lsn2controlflowandcollections.exercises2;

import java.util.Arrays;


public class ArrayPractice {
    public static void main(String[] args) {
        int[] newArray = {1, 1, 2, 3, 5, 8};

       /* for (int integer: newArray) {
            System.out.println(integer);
        }

        for (int i = 0; i < newArray.length; i++){
            if(newArray[i] % 2 != 0) {
                System.out.println(newArray[i]);
            }

        } */

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split("\\.");
        System.out.println(words);
        System.out.println(Arrays.toString(words));
    }
}
