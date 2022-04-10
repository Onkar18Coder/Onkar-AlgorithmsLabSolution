package com.lab2.practice1;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        PayMoney paymoney = new PayMoney();

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] transactionArray = paymoney.SetTransactionArray(size);

        int totalTargets = 0;
        System.out.print("Enter the total no of Targets that needs to be achieved: ");
        totalTargets = scanner.nextInt();

        while (totalTargets > 0) {
            System.out.print("Enter the value of Target: ");
            int target = scanner.nextInt();
            paymoney.TargetAchievable(transactionArray, target);
            totalTargets--;
        }
    }
}