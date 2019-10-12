package com.company.Days;

//Write a Person class with an instance variable, age,
// and a constructor that takes an integer, initialAGe, as a parameter.
// The constructor must assign initialAge to age after confirming
// the argument passed as initialAge is not negative;
// if a negative argument is passed as initialAge,
// the constructor should set age to 0 and print Age is not valid,
// setting age to 0.
// In addition, you must write the following instance methods:
//1. yearPasses() should increase the age instance variable by 1.
//2. amIOld() should perform the following conditional actions:
    //If age<13 , print You are young..
    //If age>=13 and age<18, print You are a teenager.
    //Otherwise, print You are old..

import java.util.Scanner;

public class Day4 {

    private int age;
    public Day4(int initialAge){
        if(initialAge>0){
            age = initialAge;
        }
        else{
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        }
    }
    public void amIOld(){
        if(age<13){
            System.out.println("You are young.");
        }
        else if(age<18){
            System.out.println("You are a teenager.");
        }
        else{
            System.out.println("You are old.");
        }

    }
    public void yearPasses(){
        age++;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int x = scan.nextInt();
        for(int i = 0; i<x; i++){
            int age = scan.nextInt();
            Day4 person = new Day4(age);
            person.amIOld();
            for(int j = 0; j <3; j++){
                person.yearPasses();
            }
            person.amIOld();
            System.out.println();
        }
        scan.close();
    }
}
