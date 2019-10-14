package com.company.Days;

import java.util.Scanner;

//You are given two classes, Person and Student, where Person is the
//base class and Student is the derived class.
// Completed code for Person and a declaration for Student are
// provided for you in the editor. Observe that Student inherits all
// he properties of Person.Complete the Student class by writing the following:
//A Student class constructor, which has 4 parameters:
    //A string, firstName.
    //A string, lastName.
    //An integer, id.
    //An integer array (or vector) of test scores, scores.
//A char calculate() method that calculates a Student object's average and
// returns the grade character representative of their calculated average:
public class Day12Student extends PersonDay12 {

    private int[] testScores;

    Day12Student(String firstName, String lastName, int idNumber, int[] testScores) {
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }

    public char calculate(){
        int sum = 0;
        for(int i = 0; i<testScores.length;i++){
            sum = testScores[i]+sum;
        }
        int average = sum/testScores.length;

        if(average<= 100 && average>=90){
            return 'O';
        }
        else if(average<90 && average>=80){
            return 'E';
        }
        else if(average<80 && average>=70){
            return 'A';
        }
        else if(average<70 && average>=55){
            return 'P';
        }
        else if(average<55 && average>=40){
            return 'D';
        }
        else{
            return 'T';
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the student's first name: ");
        String fName = scan.nextLine();
        System.out.println("Please enter the student's last name: ");
        String lName = scan.nextLine();
        System.out.println("Please enter the student's id number: ");
        int id = scan.nextInt();
        System.out.println("Please enter how many grades the student has: ");
        int x = scan.nextInt();
        System.out.println("Please enter the student's grades: ");
        int[] scores = new int[x];
        for(int i = 0; i<scores.length;i++){
            int input = scan.nextInt();
            scores[i] = input;
        }

        Day12Student student = new Day12Student(fName, lName, id, scores);


        System.out.println("\nGrading Scale: "+student.calculate());
    }
}
