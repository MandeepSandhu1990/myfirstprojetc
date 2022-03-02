package com.company;

public class Array {
    public static void main(String[] args) {

        int arr[][] = new int[][]{
                {1, 2, 3},
                {5, 7, 9},
                {3, 5, 6},
                {6, 5, 9},
                {4, 6, 3}
        };

        int rows = arr.length;
        int coloumns = arr[0].length;
        for(int i = 0; i< coloumns; i++){
             int s=0;

            for(int j = 0; j< rows; j++){
               s=s+ arr[j][i] ;
            }
            System.out.println(s/rows);
        }


//        char name[] = new char[]{'M','a','n','d','e','e','p'};
//        for(int i=0; i<name.length;i++){
//            System.out.print(name[i]);
//        }


        //int marks[] = new int[5];
//        int s=0;
//        for(int i=0; i<5; i++){
//            marks[i] = 10;
//            s=s+marks[i];
//            System.out.println(s);
//        }
//        double arr[] = new double[10];
//        double s = 0;
//        for(int i =0; i<10;i++){
//             arr[i] = 1.2;
//            s=s+ arr[i];
//            System.out.println(s);
//
//        }




//        int marks[] = new int[5];
//        System.out.println(marks.length);
//        for(int i =0; i <5; i++){
//            marks[i] = 10;
//        }
//        for(int i =0; i <5; i++){
//            System.out.println(marks[i]);
//        }
//


//int marks[] = new int[10];
//marks[0] = 100;
//marks[5] =300;
//        System.out.println(marks[0]);
//        System.out.println(marks[5]);


    }

}
