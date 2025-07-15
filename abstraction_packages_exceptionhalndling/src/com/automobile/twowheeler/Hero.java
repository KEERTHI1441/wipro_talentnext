package com.automobile.twowheeler;


import com.automobile.Vehicle;

public class Hero extends Vehicle {
    public String getModelName() {
        return "Hero Splendor";
    }

    public String getRegistrationNumber() {
        return "AP01AB1234";
    }

    public String getOwnerName() {
        return "Ravi Kumar";
    }

    public int getSpeed() {
        return 80;
    }

    public void radio() {
        System.out.println("Radio is playing music.");
    }
}
