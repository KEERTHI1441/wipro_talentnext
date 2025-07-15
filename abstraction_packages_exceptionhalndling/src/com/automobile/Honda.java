package com.automobile;

public class Honda extends Vehicle {
    public String getModelName() {
        return "Honda City";
    }

    public String getRegistrationNumber() {
        return "AP02CD5678";
    }

    public String getOwnerName() {
        return "Priya Sharma";
    }

    public int getSpeed() {
        return 120;
    }

    public void cdplayer() {
        System.out.println("CD Player is playing a track.");
    }
}
