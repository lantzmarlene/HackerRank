package com.company.Days;
//Given the meal price (base cost of a meal),
// tip percent (the percentage of the meal price being added as tip),
// and tax percent (the percentage of the meal price being added as
// tax) for a meal, find and print the meal's total cost.


import java.util.Scanner;

public class Day2 {

    static void solve(double meal_cost, int tip_percent, int tax_percent){
        meal_cost = meal_cost;
        tip_percent = (int) (meal_cost*(tip_percent/100));
        tax_percent = (int) (meal_cost*(tax_percent/100));
       double totalCost = (double) meal_cost+tip_percent+tax_percent;
        System.out.println("The total meal costs: "+totalCost);

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How much was the meal?:");
        double meal_cost = scan.nextDouble();
        System.out.println("How much was the tip percent?:");
        int tip_percent = scan.nextInt();
        System.out.println("How much was the tax percent?:");
        int tax_percent = scan.nextInt();

        solve(meal_cost, tip_percent, tax_percent);


        scan.close();



    }
}
