package com.company;

public class EvenArrays {
    int arr[] = new int[]{3,2,8,1,4,7};
    public int countEven(){
        int count = 0;
        for(int i =0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Even numbers:" + " " + arr[i]);
            }
        }
            return count;
        }
    }

