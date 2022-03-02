package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Case_Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        System.out.println("Enter index of i: ");
        int i = sc.nextInt();
        System.out.println("Enter index of j: ");
        int j = sc.nextInt();
        swapString(s,i,j);

    }

    public static void swapString(String s, int i, int j) {
        char[] chars = s.toCharArray();
        System.out.println("Before Swapping" + " " + Arrays.toString(chars));
        char swap;
        swap = chars[i];
        chars[i] = chars[j];
        chars[j] = swap;
        System.out.println("After Swapping: " + " " + Arrays.toString(chars));
    }
}
