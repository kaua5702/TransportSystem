package com.kauabiscotto.TransportSystem;

public class Car extends Vehicle {

    public Car(String plate, int capacity, int fuelConsumption){
        super (plate, capacity, fuelConsumption);
    }

    public double calcularTarifa(double distance) {
        return (distance * getFuelConsumption()) + 15;
    }

    @Override
    public String toString() {
        return "Car [Plate: " + getPlate() +
                ", Capacity: " + getCapacity() +
                ", Fuel Consumption: " + getFuelConsumption() +
                "] Passengers: " + getPassengersList();
    }


}
