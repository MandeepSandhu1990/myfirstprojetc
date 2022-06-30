package com.company;

public class Son extends Father {
    private String hobby;

    public Son(String familySurName, String address, long assetValue, String hobby) {
        super(familySurName, address, assetValue);
        this.hobby = hobby;
    }


    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public void whatToCookForDinner() {
        System.out.println("Burger");
    }

    public void myPersonalMethod(){
        System.out.println("My personel method");
    }
}
