package com.company.Days;
//Task:
// Complete the code in the editor below. The variables i, d and s
// are already declared and initialized for you. You must:
//Declare  variables: one of type int, one of type double, and one of type String.
//Read  lines of input from stdin (according to the sequence given in the Input Format
// section below) and initialize your  variables.
// Use the  operator to perform the following operations:
//1. Print the sum of  plus your int variable on a new line.
//2. Print the sum of  plus your double variable to a scale of one decimal place on a new line.
//3. Concatenate  with the string you read as input and print the result on a new line.

import java.util.Scanner;

public class Day1 {

    public static void main(String[] args){
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";

        Scanner scan = new Scanner(System.in);

        //Declare second integer, double and string variables
        //Read and save an an integer, double an string to your variables
        System.out.println("Please enter a String");
        String scanString = scan.nextLine();
        System.out.println("Please enter an Integer:");
        int scanInt = scan.nextInt();
        System.out.println("Please enter a Double");
        double scanDouble = scan.nextDouble();


        scan.close();
        System.out.println("Your answers are:");
        //Print the sum of both integer, double variables on new lines
        System.out.println(i+" + "+scanInt+" = "+(i+scanInt));
        System.out.println(d+" + "+scanDouble+" = "+(d+scanDouble));
        //Concatenate and print the String variable on a new line"
        System.out.println(s+" + "+scanString+" = "+s+" "+scanString);


    }
}
