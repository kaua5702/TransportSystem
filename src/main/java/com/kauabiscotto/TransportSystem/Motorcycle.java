package com.kauabiscotto.TransportSystem;

public class Motorcycle extends Vehicle {

    public Motorcycle(String plate, int capacity, int fuelConsumption) {
        super(plate, capacity, fuelConsumption);
    }

    public double calcularTarifa(double distance) {
        return (distance * getFuelConsumption()) * 0.8;
    }

    @Override
    public String toString() {
        return "Motorcycle [Plate: " + getPlate() +
                ", Capacity: " + getCapacity() +
                ", Fuel Consumption: " + getFuelConsumption() +
                "] Passengers: " + getPassengersList();
    }
}
