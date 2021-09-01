package com.ocp;

public class Truck extends Vehicle {
    private int tyreCount;

    public Truck(String type, String modal, String vehicleNumber) {
        super(type, modal, vehicleNumber);
    }

    public void setTyreCount(int tyreCount) {
        this.tyreCount = tyreCount;
    }

    @Override
    public void drive() {
        System.out.println("Driving truck with heavy load and tyres in my truck is: " + tyreCount);
    }
}
