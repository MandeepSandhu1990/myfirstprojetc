package com.company;

public class Father {
    private String familySurName;
    private String address;
    private long assetValue;

    public Father(String familySurName, String address, long assetValue) {
        this.familySurName = familySurName;
        this.address = address;
        this.assetValue = assetValue;
    }

    @Override
    public String toString() {
        return "Father{" +
                "familySurName='" + familySurName + '\'' +
                ", address='" + address + '\'' +
                ", assetValue=" + assetValue +
                '}';
    }

    public String getFamilySurName() {
        return familySurName;
    }

    public void setFamilySurName(String familySurName) {
        this.familySurName = familySurName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(long assetValue) {
        this.assetValue = assetValue;
    }
    public void whatToCookForDinner(){
        System.out.println("Pizza");
    }
}
