package com.company;

public class Index {

    double height;
    double weight;
    public Index(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public Index() {

    }


    public void massIndex(double height, double weight){
        System.out.println("Your height in m:" + " " + height);
        System.out.println("your weight in Kg:" + " " + weight);
        System.out.println("Body mass index is:" + " " + weight / (height*height));
    }
}
