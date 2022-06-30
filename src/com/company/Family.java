package com.company;

import java.util.Arrays;

public class Family {
    private String fatherName;
    private String motherName;
    private String sonName;
    private String daughterName;
    private int fatherSalary;
    private int motherSalary;
    private int sonFee;
    private int daughterFee;
    private int grocery = 500;

    public Family() {
        this.fatherName = "Balwinder Singh";
        this.motherName = "Davinder Kaur";
        this.sonName = "Baljit Singh";
        this.daughterName = "Mandeep Kaur";
        this.fatherSalary = 30000;
        this.motherSalary = 25000;
        this.sonFee = 10000;
        this.daughterFee = 15000;

    }


    public Family(String fatherName, String motherName, String sonName, String daughterName, int fatherSalary,
                  int motherSalary, int sonFee, int daughterFee, int grocery) {
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.sonName = sonName;
        this.daughterName = daughterName;
        this.fatherSalary = fatherSalary;
        this.motherSalary = motherSalary;
        this.sonFee = sonFee;
        this.daughterFee = daughterFee;
        this.grocery = grocery;
    }


    public void displayNames(){
        String names[] ={fatherName, motherName, sonName, daughterName};
        System.out.println(Arrays.toString(names));
    }

    public int getTotalSalary(){
        return fatherSalary + motherSalary;
    }
    public int getTotalFee(){
        return sonFee + daughterFee;
    }
    public int totalSavings(){
        return getTotalSalary()-getTotalFee()-500;
    }
    public void checkSavings(int savings){
        if(savings>1000){
            System.out.println("Congratulations:" + " " + fatherName + " saved " + savings);
        }
        else{
            System.out.println("Dear" + fatherName + "Please try to save for next month");
        }
    }

}
