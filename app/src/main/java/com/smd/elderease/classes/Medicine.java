package com.smd.elderease.classes;

public class Medicine
{
    private String medicine_name;
    private String medicine_descriptiomn;
    private int price,image;

    public Medicine(String medicine_name, String medicine_descriptiomn, int price, int image) {
        this.medicine_name = medicine_name;
        this.medicine_descriptiomn = medicine_descriptiomn;
        this.price = price;
        this.image = image;
    }

    public String getMedicine_name() {
        return medicine_name;
    }

    public void setMedicine_name(String medicine_name) {
        this.medicine_name = medicine_name;
    }

    public String getMedicine_descriptiomn() {
        return medicine_descriptiomn;
    }

    public void setMedicine_descriptiomn(String medicine_descriptiomn) {
        this.medicine_descriptiomn = medicine_descriptiomn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
