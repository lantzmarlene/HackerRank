package com.company.Days;

import java.util.Scanner;

//Given a Book class and a Solution class, write a MyBook class that does the following:
//Inherits from Book
//Has a parameterized constructor taking these 3 parameters:
//string title
//string author
//int price
//Implements the Book class' abstract display() method so it prints these 3 lines:
//Title: a space, and then the current instance's title.
//Author:, a space, and then the current instance's author.
//Price:, a space, and then the current instance's price .
public class Day13 extends Day13Book {

    public Day13(String title, String author, int price) {
        super(title, author, price);
    }

    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: $"+price);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the Book's title: ");
        String title = scan.nextLine();
        System.out.println("Please enter the Book's author: ");
        String author = scan.nextLine();
        System.out.println("Please enter the Book's price: ");
        int price = scan.nextInt();
        Day13 myBook = new Day13(title, author, price);
        myBook.display();
    }
}
