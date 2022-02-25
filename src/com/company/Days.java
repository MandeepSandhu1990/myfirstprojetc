package com.company;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        System.out.println("Please enter your month");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        printDays(month);


    }

    public static void printDays(int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month ==10 || month == 12){
            System.out.println("31 days");
        }
        else if ( month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("30 days");
        }
        else if( month == 2){
            System.out.println("28 days");
        }
        else {
            System.out.println("wrong input");
        }
    }
}
