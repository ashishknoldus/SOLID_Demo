package com.ocp;

public abstract class Vehicle {
    private final String type;
    private final String modal;
    private final String vehicleNumber;

    public Vehicle(String type, String modal, String vehicleNumber) {
        this.type = type;
        this.modal = modal;
        this.vehicleNumber = vehicleNumber;
    }

    public abstract void drive();
}
