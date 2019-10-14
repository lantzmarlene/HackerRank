package com.company.Days;

import java.util.Scanner;

//Write a factorial function that takes a positive integer, n
// as a parameter and prints the result of n! (n factorial).
public class Day9 {

    public static int factorial(int n){
        if (n==1){
            return 1;
        }
        else{
            return factorial(n-1)*n;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the integer you would like to find the factorial of: ");
        int input = scan.nextInt();
        System.out.println(factorial(input));


    }
}
