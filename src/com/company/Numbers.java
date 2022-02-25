package com.company;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        System.out.println("i have thought a number(1-100)");
        double computerInput = (int)(Math.random())*100;
        System.out.println("Guess my Number");

        while(true){
            int userInput = sc.nextInt();
            if(userInput == computerInput){
                System.out.println("you won, guess is right");
                break;
            }
            System.out.println("sorry your guess wrong");
        }

    }
    }

