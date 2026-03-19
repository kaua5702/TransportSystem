package com.kauabiscotto.TransportSystem;

public class Trip {

    private String city;
    private String destination;
    private double distance;
    private Vehicle vehicle;
    private Driver driver;


    public Trip(String city, String destination, double distance, Vehicle vehicle, Driver driver) {
        this.city = city;
        this.destination = destination;
        this.distance = distance;
        this.vehicle = vehicle;
        this.driver = driver;
    }

    public double calcularCusto() {
        return  vehicle.calcularTarifa(distance);
    }

    // toString para mostrar detalhes da viagem
    @Override
    public String toString() {
        return "Trip Details:\n" +
                "Origin: " + city + "\n" +
                "Destination: " + destination + "\n" +
                "Distance: " + distance + " km\n" +
                "Driver: " + driver + "\n" +
                "Vehicle: " + vehicle + "\n";
    }

}
