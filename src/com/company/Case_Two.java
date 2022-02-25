package com.company;

import java.util.Scanner;

public class Case_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You have thought a number (1-10)");
        int random = (int) (Math.random()*10);
        //System.out.println(random);
        System.out.println("Guess my number");

        do{
            int userInput = sc.nextInt();
            if(userInput == random){
                System.out.println("you won, guess was right");
                break;
            }
            System.out.println("guess was wrong");
            if(userInput>random){
                System.out.println("the number you entered is greater than actual number");
            }else
            {
                System.out.println("The number you entered is less than actual number");
            }
        }while(true);



//        for(int i=5; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print(i);
//            }
//            System.out.println('\n');
//        }

//        int k = 10;
//        while(k<=5){
//            System.out.println("hello");
//            k++;
//        }

//        int x = 100;
//        do{
//            System.out.println(x);
//            x++;
//        }while(x<=10);


    }
}
