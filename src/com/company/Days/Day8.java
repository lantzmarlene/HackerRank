package com.company.Days;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Given n names and phone numbers, assemble a phone book that
// maps friends' names to their respective phone numbers.
// You will then be given an unknown number of names to query
// your phone book for. For each name queried, print the associated
// entry from your phone book on a new line in the form
// name=phoneNumber; if an entry for name is not found,
// print Not found instead.
public class Day8 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many entries you have in your phonebook: ");
        int x = scan.nextInt();
        Map<String,Integer> phonebook = new HashMap<String, Integer>();

        for(int i = 0; i<x; i++){
            System.out.print("Please enter a name: ");
            String name = scan.next();
            System.out.print("Please enter a number: ");
            int phone = scan.nextInt();

            phonebook.put(name, phone);
        }

        while(scan.hasNext()){
            System.out.println("Please enter the name you would like to retrieve");
            String name = scan.next();
            if(phonebook.containsKey(name)){
                int phone = phonebook.get(name);
                System.out.println(name+ " = "+phone);
            }else {
                System.out.println("Not Found");
            }
        }

        scan.close();
    }
}
