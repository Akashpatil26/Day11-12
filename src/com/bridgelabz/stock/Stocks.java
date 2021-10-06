package com.bridgelabz.stock;

import javax.swing.*;
import java.util.Scanner;

public class Stocks {

    private String stockName;
    private int numberOfShare;
    private int sharePrice;

    public static void calculateStockValue(String stockName,int numberOfShare ,int sharePrice ){
        int valueOfStock;
        if(numberOfShare>0 && sharePrice>0) {
            System.out.println("Stock name: " + stockName);
            System.out.println("NUmber of Shares " +numberOfShare);
            System.out.println("Share Price of stock "+sharePrice);
            valueOfStock =numberOfShare * sharePrice;
            System.out.println("Portfolio of Stock: " +valueOfStock);
        }
        else {
            System.out.println("Enter Stock details ");
        }

    }


    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Stock Name: ");
        String stockName = scanner.next();
        System.out.println("Enter number of shares :");
        int numberOfShare = scanner.nextInt();
        System.out.println("Enter Share price of Stock :");
        int sharePrice = scanner.nextInt();*/
        calculateStockValue("Reliance ",25,100);


    }


}
