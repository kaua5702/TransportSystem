package com.kauabiscotto.TransportSystem;

public class Bus extends Vehicle {

    public Bus(String plate, int capacity, int fuelConsumption) {
        super(plate, capacity, fuelConsumption);
    }

    public double calcularTarifa(double distance) {
        double custoTotal = distance * getFuelConsumption();
        int qtdPassengers = getPassengersList().size();
        if (qtdPassengers > 0) {
            return custoTotal / qtdPassengers;
        } else {
            return custoTotal;
        }
    }

    @Override
    public String toString() {
        return "Bus [Plate: " + getPlate() +
                ", Capacity: " + getCapacity() +
                ", Fuel Consumption: " + getFuelConsumption() +
                "] Passengers: " + getPassengersList();
    }


}
