package com.company;


public class Exercise {
    public static void main(String[] args) {

        /*for (int i=1; i<=10; i++){
            System.out.println("Hello");
        }*/
        for (int i=1; i<=100; i++){
            if(i%2==0)
            System.out.println(i);
        }

        int x =3;
        if(x > 2){
            System.out.println("positive");
        }
        else if( x > 5){
            System.out.println("negative");
        }
        else{
            System.out.println("Zero");
        }

        int b = 10;

        if(b%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }


        //display full name
        String fullName = printFullName("Mandeep", "Kaur");
        System.out.println("My full name is " + fullName);

        // display square number
        int square = square(3);
        System.out.println("square of numbers: " + square);

        //display sum of three numbers
        int sum = sum(3, 5, 7);
        System.out.println("sum of three numbers: " + sum);

        //display area of rectangle
        int areaOfRectangle = area_of_rectangle(3, 7);
        System.out.println("Area of rectangle is: " + areaOfRectangle);

        //display area of circle
        double circle = areaOfCircle(4);
        System.out.println("area of circle is: " + circle);
    }

    public static String printFullName(String firstname, String lastname) {
        return firstname + lastname;
    }

    public static int square(int i) {
        return i * i;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int area_of_rectangle(int length, int width) {
        return length * width;
    }

    public static double areaOfCircle(int r) {
        return Math.PI * r * r;
    }
}
