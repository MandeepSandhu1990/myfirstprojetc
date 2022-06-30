package abc;

public class Person {
    private String firstName;
    private String lastName;
    private int sinNum;

    public Person(String firstName, String lastName, int sinNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sinNum = sinNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSinNum() {
        return sinNum;
    }

    public void setSinNum(int sinNum) {
        this.sinNum = sinNum;
    }
    public String disp(){
        System.out.println("Display members");
        return("First name: " + " " + firstName + "\n " + "Last name: " + lastName + "\n " + "Sin Number:" + " " + sinNum);
    }
}
