package com.company;

public class Array {
    public static void main(String[] args) {
        int arr[][] = new int[][]{
                {1,2,3,4},
                {3,5,7,9},
                {3,7,9,1}
        };
        for(int i=0;i<3;i++){
            int s=0;
            for(int j=0; j<4;j++){
                s=s+arr[i][j];
            }
            System.out.println(s);

        }
//        int marks[] = new int[5];
//        System.out.println(marks.length);
//        for(int i=0; i<5;i++){
//            marks[i] = 10;
//        }
//        for(int i=0; i<5;i++){
//            System.out.println(marks[i]);
//        }

//        int s=0;
//        for(int i=0; i<5;i++){
//            s=s+marks[i];
//        }
//        System.out.println(s);
    }
}
