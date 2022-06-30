package com.company;

public class Student {
    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private static String schoolName;
    static {
        schoolName = "Pragra";
    }
    private String fullName;
    private  int id;

    public Student(String fullName, int id) {
        this.fullName = fullName;
        this.id = id;
    }

}
