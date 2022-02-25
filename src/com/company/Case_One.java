package com.company;

public class Case_One {
    public static void main(String[] args) {

        // sum of natural numbers
        int sum =0;
        for(int i=1; i<10; i++){
            sum = sum + i;
        }
        System.out.println("sum of natural numbers:" + " " + sum);

        //sum of even numbers
        int even=0;
        for(int i=1; i<=10; i++){
            if(i%2==0){
               even = even + i;
            }
        }
        System.out.println("sum of even numbers: " + " " + even);

        // sum of odd numbers
        int odd = 0;
        for(int i=1; i<=10;i++){
            if(i%2!=0){
                odd = odd + i;
            }
        }
        System.out.println("Sum of odd numbers: " + " " + odd);

        //find factorial number

        int fact = 1;
        int number = 10;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial number: " + " " + fact);

        // fibonacci series
        
        int a=0;
        int b=1;
        int c;
        System.out.println("Fibonacci series:");
        for(int i=1; i< 10; i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }


    }
}
