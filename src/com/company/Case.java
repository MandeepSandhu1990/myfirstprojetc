package com.company;

public class Case {
    public static void main(String[] args) {
        int month =2;

        switch (month){
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 3:
                System.out.println("30");
                break;
            default:
                System.out.println("wrong input");
                break;
        }
        System.out.println("done");
    }


}
