package com.bridgelabz.stock;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        System.out.println("Welcome to your Account :");
        double balance =1000;
        System.out.println("Balance is: "+balance);
        System.out.println("Enter amount to be credited to your account");
        Scanner scanner = new Scanner(System.in);
        double creditAmount = scanner.nextDouble();
        balance=balance + creditAmount;
        System.out.println(balance);

        System.out.println("Enter amount to be debited");
        double debitAmount = scanner.nextDouble();
        if (debitAmount > balance) {
            debitAmount=0;
            System.out.println("Debit amount exceeded account balance ");
        } else {
            balance=balance - debitAmount;
            System.out.println("Remaining balance is: "+balance);
        }

    }

}
