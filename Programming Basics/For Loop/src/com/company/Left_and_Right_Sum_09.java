package com.company;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Left_and_Right_Sum_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int left = 0;
        int right = 0;

        for (int i = 0; i < n; i++) {

            left += Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < n;i++){

            right += Integer.parseInt(scanner.nextLine());
        }

        if (left == right) {
            System.out.println("Yes, sum = "  + left);
        } else {
            int diff = Math.abs(right - left);
            System.out.println("No, diff = " + diff);
        }


    }
}
