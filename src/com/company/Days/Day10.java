package com.company.Days;

import java.util.Scanner;

//Given a base 10 integer, n,
// convert it to binary (base-2).
// Then find and print the base-10 integer
// denoting the maximum number of consecutive 1's in 0's
// binary representation.
public class Day10 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer you would like to convert to binary: ");
        int input = scan.nextInt();

        scan.close();

        int count = 0;
        int max = 0;
        String x ="";

        while(input>0){
            if(input%2 == 1){
                x = input+""+x;
                input = input/2;
                count++;

            }

        }
        System.out.println("Binary Number: "+x);
        System.out.println("Number of 1s: "+count);
    }
}
