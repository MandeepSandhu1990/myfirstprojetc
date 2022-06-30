package com.company;

class Employeee implements Comparable<Employeee> {
    private String name;

    public Employeee(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Employeee another) {
        return another.name.compareTo(this.name);
    }
}
