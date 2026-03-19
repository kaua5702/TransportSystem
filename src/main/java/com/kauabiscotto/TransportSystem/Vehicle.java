package com.kauabiscotto.TransportSystem;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

    private String plate;
    private int capacity;
    private int fuelConsumption;
    private List<String> passengersList;

    public Vehicle(String plate, int capacity, int fuelConsumption) {
        this.plate = plate;
        this.capacity = capacity;
        this.fuelConsumption = fuelConsumption;
        this.passengersList = new ArrayList<>();
    }

    public String getPlate() {
        return plate;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public List<String> getPassengersList() {
        return passengersList;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setPassengersList(List<String> passengersList) {
        this.passengersList = passengersList;
    }

    public void registrarPassageiro(String name) {
        if (passengersList.size() < capacity) {
            if (!passengersList.contains(name)) {
                passengersList.add(name);
                System.out.println("Passenger " + name + " registered");
            }
        } else {
            System.out.println("Maximum capacity reached");
        }
    }


    public abstract double calcularTarifa(double distance);


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicle [Plate: ").append(plate)
                .append(", Capacity: ").append(capacity)
                .append(", Fuel Consumption: ").append(fuelConsumption)
                .append("]\nPassengers: ");

        if (passengersList.isEmpty()) {
            sb.append("No passengers registered.");
        } else {
            for (String passenger : passengersList) {
                sb.append(passenger).append(", ");
            }
            // Remove a última vírgula e espaço
            sb.setLength(sb.length() - 2);
        }

        return sb.toString();
    }
}
