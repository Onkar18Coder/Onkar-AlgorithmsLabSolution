package com.lab2.practice2;

import java.util.Arrays;
import java.util.Scanner;

public class Currency {
    public int[] SetCurrencyDenominations(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] currencyDenominations = new int[size];

        System.out.print("Enter the currency denominations values: ");

        for (int i = 0; i<size; i++)
            currencyDenominations[i] = scanner.nextInt();

        return currencyDenominations;
    }

    public void PayAmount(int[] currencyDenominations, int amount) {
        System.out.println("Your payment approach in order to give min no of notes will be");
        Arrays.sort(currencyDenominations);

        // Sort the currencyDenominations
        MergeSortAlgorithm mergeSort = new MergeSortAlgorithm();
        mergeSort.MergeSort(currencyDenominations, 0, currencyDenominations.length-1);

        // Handle "Arithmetic Exception Divide by Zero" if occurred
        try {
            for(int i= currencyDenominations.length-1; i>=0; i--) {
                if(currencyDenominations[i] <= amount) {
                    System.out.println(currencyDenominations[i] + " : " + amount/currencyDenominations[i]);
                    amount %= currencyDenominations[i];

                    if (amount == 0)
                        break;
                }
            }
        } catch (ArithmeticException e) {
            System.out.println(e + " notes of denomination is invalid.");
        }
    }
}