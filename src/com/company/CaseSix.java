package com.company;

public class CaseSix {
    private String name;
    private String address;

    @Override
    public String toString() {
        return "CaseSix{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public CaseSix(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName(){
      return name;
    }
    public void setName(String name){
      this.name = name;
    }

    public void greetEmployee(){
        System.out.println("Good Morning");
    }
}
