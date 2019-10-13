package com.company.Days;

import java.util.Scanner;

//Given an array, A, of N integers, print A's
//elements in reverse order as a single line of
//space-separated numbers.
public class Day7 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many items in your array:");
        int x = scan.nextInt();
        int[] array = new int[x];
        String[] arrayItems = scan.nextLine().split(" ");
        for(int counter = 0; counter<x; counter++){
            System.out.println("Please enter your value "+(counter +1)+":");
            array[counter] = Integer.parseInt(scan.next());
        }
        scan.close();
        System.out.println("Your array in reverse is: ");
        for(int i = 0; i<x; i++){
            int index = x - i - 1;
            System.out.print(array[index]+" ");
        }



    }
}
