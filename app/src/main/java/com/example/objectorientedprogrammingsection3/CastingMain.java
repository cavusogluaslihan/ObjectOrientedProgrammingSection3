package com.example.objectorientedprogrammingsection3;

public class CastingMain {
    public static void main(String args[]){

        // UP Casting
        VehicleCarSubaru subaru = new VehicleCarSubaru();
        VehicleCar car = subaru;

        // DOWN Casting

        VehicleCar car2 = new VehicleCar();
        VehicleCarSubaru subaru2 = (VehicleCarSubaru) car2;


    }
}
