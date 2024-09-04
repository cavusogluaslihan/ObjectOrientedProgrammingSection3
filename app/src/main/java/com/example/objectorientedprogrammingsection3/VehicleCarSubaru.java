package com.example.objectorientedprogrammingsection3;

public class VehicleCarSubaru extends VehicleCar {
    private String engineSize;

    public VehicleCarSubaru() {
    }

    public VehicleCarSubaru(String engineSize) {
        this.engineSize = engineSize;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }
}
