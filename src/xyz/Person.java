package xyz;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private int age;

    public Person(){
        System.out.println("Default constructor called");
    }

    public Person(String firstName, String lastName, String address, int age) {
        System.out.println("perametrized constructor called");
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
    }

    public String getFullName(){
        return firstName + lastName;
    }

    public void changeAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }

    public int getAge() {
        return age;
    }
}
