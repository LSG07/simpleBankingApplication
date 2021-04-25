package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("NOTE - Enter Random Name and ID");
        System.out.println();

        System.out.println("Enter Customer Name");
        String cName = scanner.nextLine();

        System.out.println("Enter Customer ID");
        String cID = scanner.nextLine();

        Account Customer = new Account(cName, cID);
        Customer.showMenu();

    }
}
