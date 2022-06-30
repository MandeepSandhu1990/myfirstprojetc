package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private int age;



    public Person(){
        this.firstName = "Mandeep";
        this.lastName = " Kaur";
        this.address = "Scarborough";
        this.age = 30;
    }

    public String getFullName() {
        return firstName + lastName;
    }


    public String getAddress() {
        return address;
    }

    public void changeAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

