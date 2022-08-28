package org.launchcode.java.demos.lsn2controlflowandcollections.exercises2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayListPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> someIntegers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(sumEven(someIntegers));

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(phrase.split(" ")));

        printFiveLetterWords(wordList);
        }

    public static Integer sumEven(ArrayList<Integer> myArray){
        int total = 0;
        for(int integer: myArray){
            if(integer%2 == 0){
                total += integer;
            }
        }
        return total;
    }
    public static void printFiveLetterWords(ArrayList<String> arr){
        for(String word: arr){
            if(word.length() == 5){
                System.out.println(word);
            }
        }
    }
}
