package com.lab2.practice2;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Currency currency = new Currency();
        System.out.print("Enter the size of currency denominations: ");
        int size = scanner.nextInt();
        int[] currencyDenominations = currency.SetCurrencyDenominations(size);

        System.out.print("Enter the amount you want to pay: ");
        int amount = scanner.nextInt();
        currency.PayAmount(currencyDenominations, amount);
    }
}