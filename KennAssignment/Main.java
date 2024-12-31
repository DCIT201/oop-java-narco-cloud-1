package com.kennedy;

public class Main{
    public static void main(String[] args){

        System.out.println("Welcome to our Java project! This is an assignment. Let's get started!");

        Car car = new Car("Sedan123", "Honda Accord", 60, true);
        Motorcycle motorcycle = new Motorcycle("Speedster", "Kawasaki Ninja", 40, 3);
        Truck truck = new Truck("PickupMaster", "Chevrolet Silverado", 80, 12);

        // Create an instance of the rental agency and a customer
        RentalAgency agency = new RentalAgency();
        Customer customer = new Customer("Mr. Kennedy Sarfo");

        // Adding vehicles to the rental agency
        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        // Rent a vehicle
        agency.rentVehicle("Sedan123", client, 7);

        // Return the vehicle
        agency.returnVehicle("Sedan123");



    }
}