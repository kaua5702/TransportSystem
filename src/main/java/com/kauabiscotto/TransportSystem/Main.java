package com.kauabiscotto.TransportSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Driver input
        System.out.print("Enter driver's name: ");
        String driverName = sc.nextLine();

        System.out.print("Enter driver's license number: ");
        String license = sc.nextLine();

        System.out.print("Enter years of experience: ");
        int experience = sc.nextInt();
        sc.nextLine(); // consume line break

        Driver driver = new Driver(driverName, license, experience);

        // Vehicle choice
        System.out.println("Choose vehicle type (1-Car, 2-Motorcycle, 3-Bus): ");
        int option = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter plate number: ");
        String plate = sc.nextLine();

        System.out.print("Enter passenger capacity: ");
        int capacity = sc.nextInt();

        System.out.print("Enter fuel consumption per km: ");
        int consumption = sc.nextInt();
        sc.nextLine();

        Vehicle vehicle;
        switch (option) {
            case 1 -> vehicle = new Car(plate, capacity, consumption);
            case 2 -> vehicle = new Motorcycle(plate, capacity, consumption);
            case 3 -> vehicle = new Bus(plate, capacity, consumption);
            default -> {
                System.out.println("Invalid option, creating Car by default.");
                vehicle = new Car(plate, capacity, consumption);
            }
        }

        // Trip input
        System.out.print("Enter origin: ");
        String origin = sc.nextLine();

        System.out.print("Enter destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter distance in km: ");
        double distance = sc.nextDouble();
        sc.nextLine();

        Trip trip = new Trip(origin, destination, distance, vehicle, driver);

        // Register passengers
        System.out.println("Enter passenger names (type 'end' to finish):");
        while (true) {
            String passenger = sc.nextLine();
            if (passenger.equalsIgnoreCase("end")) break;
            vehicle.registrarPassageiro(passenger);
        }

        // Show result
        System.out.println("\n=== Trip Details ===");
        System.out.println(trip);
        System.out.println("Trip cost: $" + trip.calcularCusto());

        sc.close();
    }
}