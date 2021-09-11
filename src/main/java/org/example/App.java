/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */

package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        double price1 = scan.nextDouble();

        System.out.print("Enter the quantity of item 1: ");
        int quant1 = scan.nextInt();

        System.out.print("Enter the price of item 2: ");
        double price2 = scan.nextDouble();

        System.out.print("Enter the quantity of item 2: ");
        int quant2 = scan.nextInt();

        System.out.print("Enter the price of item 3: ");
        double price3 = scan.nextDouble();

        System.out.print("Enter the quantity of item 1: ");
        int quant3 = scan.nextInt();

        double subtotal = (price1 * quant1) + (price2 * quant2) + (price3 * quant3);

        DecimalFormat df = new DecimalFormat(".00");

        double tax = subtotal * .055;

        double total = tax + subtotal;

        System.out.print("Subtotal: $"+df.format(subtotal)+"\n");
        System.out.print("Tax: $"+df.format(tax)+"\n");
        System.out.print("Total: $"+df.format(total)+"");

    }
}