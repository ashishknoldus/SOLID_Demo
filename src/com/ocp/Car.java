package com.ocp;

public class Car extends Vehicle {
    private double speed;

    public Car(String type, String modal, String vehicleNumber) {
        super(type, modal, vehicleNumber);
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void drive() {
        System.out.println("Driving car smoothly with max speed: " + speed);
    }
}