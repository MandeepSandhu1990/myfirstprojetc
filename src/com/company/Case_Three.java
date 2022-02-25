package com.company;

import java.util.Scanner;

public class Case_Three {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' :
                System.out.println("Addition of two numbers: " + (a + b));
                break;
            case '-' :
                System.out.println("Subtraction of two numbers: " + (a-b));
                break;
            case '*' :
                System.out.println("Multiplication of two numbers: " + (a*b));
                break;
            case '/' :
                System.out.println("Divide two numbers: " + (a/b));
                break;
            case '%' :
                System.out.println("Modulus of two numbers: " + (a%b));
                break;

        }

    }
}
