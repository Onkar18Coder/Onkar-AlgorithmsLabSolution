package com.lab2.practice1;

import java.util.Scanner;

public class PayMoney {
    public int[] SetTransactionArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] transactionArray = new int[size];

        System.out.print("Enter " + size + " elements: ");

        for (int i = 0; i<size; i++)
            transactionArray[i] = scanner.nextInt();

        return transactionArray;
    }

    public void TargetAchievable(int[] array, int target) {
        int sum = 0;
        int transactions = 0;

        while(sum<target && transactions<array.length) {
            sum+=array[transactions++];
        }

        if (sum>=target) {
            System.out.println("Target achieved after " + transactions + " transactions");
        }
        else
            System.out.println("Given target is not achieved");
    }
}