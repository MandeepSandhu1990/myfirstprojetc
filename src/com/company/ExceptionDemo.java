package com.company;

public class ExceptionDemo {
    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        try {
            demo.checkEligibility();
        } catch (notEligibleException e) {
            e.printStackTrace();
        }
    }
    public void checkEligibility() throws notEligibleException {
        int age = 13;
        int weight = 24;
        if(age > 25 && weight > 45){
            System.out.println("Eligible for blood donation");
        }
        else {
            throw new notEligibleException("Not eligible for blood donation");
        }
    }
    class notEligibleException extends Exception{
        public notEligibleException(String message) {
            super(message);
        }
    }
}


