package com.company;

public class Daughter extends Father {
    private String friend;

    public Daughter(String familySurName, String address, long assetValue, String friend) {
        super(familySurName, address, assetValue);
        this.friend = friend;
    }

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }
}
