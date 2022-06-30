package xyz;

import java.util.Arrays;

public class Family {
    private String fatherName;
    private String motherName;
    private String sonName;
    private String daughterName;
    private long fatherSalary;
    private long motherSalary;
    private long sonFee;
    private long daughterFee;
    private int grocery = 500;

    public Family() {
        System.out.println("Default construtor called");
    }

    public Family(String fatherName, String motherName, String sonName, String daughterName, long fatherSalary,
                  long motherSalary, long sonFee, long daughterFee, int grocery) {
        System.out.println("parameterized constructor called");
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
        String names[] = {fatherName,motherName,sonName,daughterName};
        System.out.println(Arrays.toString(names));
    }

    public long getTotalSalary(){
        return fatherSalary + motherSalary;
    }

    public long getTotalFee(){
        return sonFee + daughterFee;
    }

    public long getSaving(){
        return getTotalSalary() - getTotalFee() - 500;
    }

    public void checkSavings(int savings){
        if(savings>1000){
            System.out.println("congratulations: " + " " + fatherName + " " + "you saved this much" + " " + getSaving());
        }else {
            System.out.println("Dear" + " " +  fatherName + " " + "Please try to save for next month");
        }
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public void setSonName(String sonName) {
        this.sonName = sonName;
    }

    public void setDaughterName(String daughterName) {
        this.daughterName = daughterName;
    }

    public void setFatherSalary(long fatherSalary) {
        this.fatherSalary = fatherSalary;
    }

    public void setMotherSalary(long motherSalary) {
        this.motherSalary = motherSalary;
    }

    public void setSonFee(long sonFee) {
        this.sonFee = sonFee;
    }

    public void setDaughterFee(long daughterFee) {
        this.daughterFee = daughterFee;
    }
}
