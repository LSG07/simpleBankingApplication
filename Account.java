package com.company;

import java.util.Scanner;

public class Account {

    //Variables
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    //Constructor
    Account(String cName, String cID) {
        customerName = cName;
        customerID = cID;
    }

    //Deposit Money Function

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    //Withdraw Money Function

    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    //Previous Transaction Function

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);

        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No past transaction has been recorded!");
        }

    }

    // Interest Function, interest rate - 2%

    void InterestCalculation(int numOfYears) {
        String interestRatePercentage = "2%";
        double interestRate = 0.02;
        double newBalance = (balance * interestRate * numOfYears) + balance;
        System.out.println("The interest Rate is " + interestRatePercentage);
        System.out.println("In " + numOfYears + " years, your balance will be: " + newBalance);

    }

    //Menu Function

    void showMenu() {

        Scanner scanner = new Scanner(System.in);

        char userInput = '\0';

        System.out.println();
        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is: " + customerID);
        System.out.println();
        System.out.println("What Service Do You Require?");
        System.out.println();
        System.out.println("Enter Corresponding Letter");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. View Previous Transaction");
        System.out.println("E. Calculate Interest");
        System.out.println("F. Exit");


        do {
            System.out.println();
            System.out.println("Enter an option: ");
            char userInput1 = scanner.next().charAt(0);
            userInput = Character.toUpperCase(userInput1);
            System.out.println();

            switch (userInput) {
                //Case 'A' allows the user to check their account balance
                case 'A':
                    System.out.println("====================================");
                    System.out.println("Balance = €" + balance);
                    System.out.println("====================================");
                    System.out.println();
                    break;
                //Case 'B' allows the user to deposit money
                case 'B':
                    System.out.println("How Much Money Would You Like To Deposit: ");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;
                //Case 'C' allows the user to withdraw money
                case 'C':
                    System.out.println("How Much Money Would You Like To Withdraw: ");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;
                //Case 'D' allows the user to view their most recent transaction
                case 'D':
                    System.out.println("====================================");
                    getPreviousTransaction();
                    System.out.println("====================================");
                    System.out.println();
                    break;
                //Case 'E' calculates the amount of interest that will be earned in "x" years
                case 'E':
                    System.out.println("Enter How Many Years That Interest Will Be Applied: ");
                    int years = scanner.nextInt();
                    InterestCalculation(years);
                    break;
                //Case 'F' exits the user from their account
                case 'F':
                    System.out.println("====================================");
                    break;
                //The default case let's the user know that they entered an invalid character
                default:
                    System.out.println("Error: invalid option. Please enter A, B, C, D, or E to access services.");
                    break;
            }
        } while (userInput != 'F');
        System.out.println("Thank you for banking with us!");
    }

}


