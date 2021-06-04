package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kate Ingraham
 */

public class App 
{
    public static void main( String[] args )
    {
        Interest userAccount = new Interest();
        userAccount.setPrincipal();
        userAccount.setIR();
        userAccount.setYears();

        System.out.println("After "+userAccount.getYears()+" years " +
                "at "+userAccount.getInputIR()+"%, " +
                "the investment will be worth " + userAccount.calcInterest()+".");
    }
}
