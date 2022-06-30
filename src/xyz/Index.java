package xyz;

public class Index {
    private double height;
    private double weight;

    public Index(){
        System.out.println("Default constructor called");
    }
    public Index(double height, double weight) {
        System.out.println("perameterized constructor called");
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
