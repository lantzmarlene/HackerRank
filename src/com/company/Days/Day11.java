package com.company.Days;

import java.util.Scanner;

//Calculate the hourglass sum for every hourglass in A,
// then print the maximum hourglass sum.
public class Day11 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int array[][] = new int[6][6];
        for(int i = 0; i<6; i++){
            for(int j = 0; j<6; j++){
                array[i][j] = scan.nextInt();
            }
        }

        int max = -9*7;

    }
}
