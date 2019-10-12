package com.company.Days;

import java.util.Scanner;

//Given an integer, n,
// print its first 10 multiples.
// Each multiple n*i (where 1<=i<=10) should be printed on a new line
// in the form: n x i = result.
public class Day5 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer you would like to see the multiples of:");
        int n = scan.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
        scan.close();
    }
}
