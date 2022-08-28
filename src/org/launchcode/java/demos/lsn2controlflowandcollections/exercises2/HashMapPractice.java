package org.launchcode.java.demos.lsn2controlflowandcollections.exercises2;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer,String> classRoster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter student name: (or ENTER to finish)");

        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if(!newStudent.equals("")) {
                System.out.println("ID: ");
                Integer newId = input.nextInt();
                classRoster.put(newId, newStudent);

                input.nextLine();
            }

        } while(!newStudent.equals(""));

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + " Id: " + student.getKey());
        }

    }

}
