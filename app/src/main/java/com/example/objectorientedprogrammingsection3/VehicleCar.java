package com.example.objectorientedprogrammingsection3;

public class VehicleCar extends Vehicle {
    private String bodyTypes;

    public VehicleCar() {
    }

    public VehicleCar(String bodyTypes) {
        this.bodyTypes = bodyTypes;
    }

    public String getBodyTypes() {
        return bodyTypes;
    }

    public void setBodyTypes(String bodyTypes) {
        this.bodyTypes = bodyTypes;
    }

    public void getInfoCar(){

        System.out.println(bodyTypes);
        System.out.println(getGearTypes());
        System.out.println(super.getColor()); //super ile bir üst classtan çağırabiliriz.

    }


}
