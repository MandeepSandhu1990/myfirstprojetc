package com.company;

public enum size {

    SMALL(1),
    MEDIUM(2),
    LARGE(3);

    private int getNumber;

    private size(int s) {
        this.getNumber=s;
    }

    public int getGetNumber() {
        return getNumber;
    }
}
