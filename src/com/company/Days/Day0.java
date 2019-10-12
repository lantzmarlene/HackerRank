package com.company.Days;

//Task:
//To complete this challenge, you must save a line of input from stdin to a variable,
// print Hello, World. on a single line, and finally print the value of your variable on a second line.

import java.util.Scanner;

public class Day0 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Please iput");
        System.out.println(input);

        System.out.println("Hello World");

        scan.close();
    }
}
