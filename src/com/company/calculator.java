package com.company;

public class calculator {
    public static void main(String[] args) {
        ////adding by two methods
        System.out.println("first method: " + sum(3,7));
        int sum = sum(2, 6);
        System.out.println("second method sum is: " + sum);

      // subtraction using two methods
        System.out.println("first method: " + sub(6,5));
        int sub = sub(9, 5);
        System.out.println("second method subtraction is: " + sub);

      // multiply using two methods
        System.out.println("first method: " + multiply(6,9));
        int multiply = multiply(3, 2);
        System.out.println("second method multiply is: " + multiply);

      //divide using two methods
        System.out.println("first method: " + divide(6,3));
        int divide = divide(4, 2);
        System.out.println("second method divide is: " + divide);

    }
    public static int sum(int a, int b) {
        return(a + b);
    }

    public static int sub(int c,int d) {
        return(c - d);
    }

    public static int multiply(int e, int f) {
        return(e*f);
    }

    public static int divide(int g, int h) {
        return(g/h);
    }
}


