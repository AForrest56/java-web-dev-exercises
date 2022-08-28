package org.launchcode.java.demos.lsn2controlflowandcollections.exercises2;


import java.util.HashMap;
import java.util.Scanner;


public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer,String> classRoster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();
        } while(!newStudent.equals(""));
    }

}
