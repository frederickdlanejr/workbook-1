package com.pluralsight;
import java.util.*;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double baseRate = 29.99;
        double tollRate = 3.95;
        double gpsRate = 2.95;
        double roadsideRate = 3.95;
        double ageSurcharge = 0.30;
        int agelimit = 25;

        System.out.println("Welcome to Guy Co. Car Rentals!");

        System.out.print("Enter pickup date (e.g., MM/DD/YYYY): ");
        String pickupDate = scanner.nextLine();

        System.out.print("Enter number of rental days: ");
        int rentalDays = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Do you want an electronic toll tag ($3.95 per day)? (Yes or no): ");
        String tollRateOption = scanner.nextLine();

        System.out.print("Do you want a GPS ($2.95 per day)? (Yes or No): ");
        String gpsRateOption = scanner.nextLine();

        System.out.print("Do you want roadside assistance ($3.95 per day)? (Yes or no): ");
        String roadsideRateOption = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();


        double baseRental = baseRate * rentalDays;

        double optionsCost = 0;
        if (tollRateOption.equalsIgnoreCase("yes")) {
            optionsCost += tollRate * rentalDays;
        }
        if (gpsRateOption.equalsIgnoreCase("yes")) {
            optionsCost += gpsRate * rentalDays;
        }
        if (roadsideRateOption.equalsIgnoreCase("yes")) {
            optionsCost += roadsideRate * rentalDays;
        }

        double underageSurcharge = 0;
        if (age < agelimit) {
            underageSurcharge = baseRental * ageSurcharge;
        }

        double totalCost = baseRental + optionsCost + underageSurcharge;


        System.out.println("\n--- Price Breakdown ---");
        System.out.println("Pickup Date: " + pickupDate);
        System.out.printf("Basic Car Rental: $%.2f%n", baseRental);
        System.out.printf("Options Cost: $%.2f%n", optionsCost);
        System.out.printf("Underage Driver Surcharge: $%.2f%n", ageSurcharge);
        System.out.printf("Total Cost: $%.2f%n", totalCost);
    }
}
