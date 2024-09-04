package com.example.objectorientedprogrammingsection3;

public class Vehicle {
    private String color;
    private String gearTypes;

    public Vehicle() {
    }

    public Vehicle(String color, String gearTypes) {
        this.color = color;
        this.gearTypes = gearTypes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGearTypes() {
        return gearTypes;
    }

    public void setGearTypes(String gearTypes) {
        this.gearTypes = gearTypes;
    }
}
