package com.company.Days;

import java.util.Random;
import java.util.stream.IntStream;

//Given an integer, , perform the following conditional actions:
//If  is odd, print Weird
//If  is even and in the inclusive range of  to , print Not Weird
//If  is even and in the inclusive range of  to , print Weird
//If  is even and greater than , print Not Weird
//Complete the stub code provided in your editor to print whether or not  is weird.
public class Day3 {

    public static void main(String[] args){

        Random rand = new Random();
        for(int i = 0; i<30; i++){
            int x = rand.nextInt(50);
            if(x%2==0){
                System.out.println(x+" Even");
            }
            else{
                System.out.println(x+" Odd");
            }

        }



    }
}
