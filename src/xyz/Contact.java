package xyz;

import java.util.Scanner;

class MainContact  {
    public static void main(String[] args) {
        Contact[] contacts = new Contact[10];
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
    }
}
public class Contact {
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String email;
}
