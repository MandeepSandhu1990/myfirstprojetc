package xyz;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person("Mandeep", "Kaur", "Toronto", 30);
//        System.out.println("Full Name:" + " " + person.getFullName());
//        System.out.println("Address before changing:" + " " +  person.getAddress());
//        person.changeAddress("Scarborough");
//        System.out.println("Address after changing:" + " " + person.getAddress());
//        System.out.println("Age:" + " " + person.getAge());

        Family family = new Family();
        family.setFatherName("Balwinder Singh");
        family.setMotherName("Davinder Kaur");
        family.setSonName("Baljit Singh");
        family.setDaughterName("Mandeep Kaur");
        family.setFatherSalary(45000);
        family.setMotherSalary(30000);
        family.setDaughterFee(12000);
        family.setSonFee(14000);

        family.displayNames();

        System.out.println("Total savings: " + " " + family.getSaving());
        family.checkSavings(32000);

        Index index = new Index(1.75,73.0);
        System.out.println("your height in m: " + " " + index.getHeight());
        System.out.println("your weight in kg:" + " " + index.getWeight());
        System.out.println("Body mass index is: " + index.getWeight()/(index.getHeight()* index.getHeight()));


    }
}
