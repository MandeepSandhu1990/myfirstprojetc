package com.company;

public class Assignment {
    public static void main(String[] args){
    printFullName("Mandeep" , "Kaur");
    squareOfNumbers(2);
    sumOfNumbers(2,3,4);
    areaOfRectangle(6,7);
    areaOfCircle(8);
    }

    public static void printFullName(String firstname, String lastname) {
        System.out.println("My full name is : " + firstname + " " + lastname);
    }

    public static void squareOfNumbers(int a) {
        int squareOfNumbers = a * a;
        System.out.println("Square of numbers is: " + squareOfNumbers);
    }

    public static void sumOfNumbers(int a, int b, int c) {
        int sumOfNumbers = a + b + c;
        System.out.println("sum of numbers is : " + sumOfNumbers);
    }

    public static void areaOfRectangle(int length , int width) {
        int areaOfRectangle = length * width;
        System.out.println("Area of Rectangle is : " + areaOfRectangle);
    }

    public static void areaOfCircle(double r) {
        double areaOfCircle = Math.PI * r *r;
        System.out.println("Area of Circle is : " + areaOfCircle);
    }

}
