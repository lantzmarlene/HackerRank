package com.company.Days;

public class PersonDay12 {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    PersonDay12(String firstName, String lastName, int idNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public void printPerson(){
        System.out.println(
                "Name: "+lastName+", "+firstName+
                "\nID: "+idNumber
        );
    }
}
