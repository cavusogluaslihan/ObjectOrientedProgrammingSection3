package com.example.objectorientedprogrammingsection3;

public class VehicleInheritanceMain {
    public static void main(String args[]){

        VehicleCar car = new VehicleCar();
        car.setBodyTypes("Sedan");
        car.setColor("Red");
        car.setGearTypes("Manual");

       // System.out.println(car.getBodyTypes()+ ", " + car.getColor() + ", " + car.getGearTypes());

        car.getInfoCar();

        VehicleCarSubaru subaru = new VehicleCarSubaru("1.6V");
        subaru.setColor("Blue");
        subaru.setGearTypes("Automatic");

        System.out.println(subaru.getColor());
    }
}
