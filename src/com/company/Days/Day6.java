package com.company.Days;
//Given a string, s, of length n that is indexed from 0 to n-1,
// print its even-indexed and odd-indexed characters as 2
// space-separated strings on a single line

import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input a string: ");
        String x = scan.nextLine();

        char[] charArray = x.toCharArray();


        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 == 0) {
                System.out.print(charArray[i]);
            }
        }
        System.out.print("   <-- Even indexed/Odd indexed -->   ");
        for (int j = 0; j < charArray.length; j++) {
            if (j % 2 == 1) {
                System.out.print(charArray[j]);
            }
        }
        scan.close();
    }
}
