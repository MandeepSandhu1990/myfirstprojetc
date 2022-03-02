package com.company;

import java.util.Arrays;

public class Case_Four {
    public static void main(String[] args) {
        // palindrome order
        String name1 = "wow";
        System.out.println(name1.substring(1));
        System.out.println(name1.substring(0, 1));

        char[] chars1 = name1.toCharArray();
        char[] reverseArr1 = new char[name1.length()];

        int length1 = name1.length();
        int lastindex1 = length1 - 1;
        for(int i = 0; i < length1; i++){
            reverseArr1[lastindex1-i]=chars1[i];
        }
        System.out.println(reverseArr1);

        String revr = new String(reverseArr1);
        System.out.println(revr.equals(name1));

        // Reverse order
        String name = "Mandeep";
        System.out.println("index of " + name.charAt(3));
        System.out.println(name.indexOf("de"));
        System.out.println(name.replace('n', 's'));


        char[] chars = name.toCharArray();
        char[] reverseArr = new char[name.length()];

        int length = name.length();
        int lastIndex = length - 1;
        for(int i = 0; i< length; i++){
            reverseArr[lastIndex-i]=chars[i];
        }
        System.out.println(reverseArr);

        String reverse = new String(reverseArr);
        System.out.println(reverse);

//        int arr[] = {1, 2, 3};
//        System.out.println(arr);
//        String name = "Mandeep";
//        char[] chars = name.toCharArray();
//        System.out.println(Arrays.toString(chars));
//        for(int i=0; i<name.length(); i++){
//            System.out.print(chars[i]);
//        }

//        System.out.println(name.toUpperCase());
//        System.out.println(name.concat(" kaur"));
//        System.out.println(name.length());
//        System.out.println(name.startsWith("M"));


//        String s5  =new String("java"); // 2 object created
//        String s6 = new String("hjsbd");// 2 object created
//        String s1 = "java"; // 0 object created
//        String s2 = "java"; //0 object created
//        String s3 = "hgjfkfk"; //1 object created
//
//        String s4 = s2.concat(" Class");
//        System.out.println(s1==s2);
//        System.out.println(s1==s5);

//        System.out.println(s2.equals(s3));
//        System.out.println(s1.equals(s5));


        //s2 = s2.toUpperCase();
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s4);

    }
}
