package com.pluralsight;

import java.util.*;

public class ShopPOS {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to 'Jersey John's'! Would you like to order today? (Please type either 'Yes' or 'No')");
            String order = scanner.next();
            double regsize = 5.45;
            double lrgsize = 8.95;
            double finalPrice = 0;

            if (order.equalsIgnoreCase("No")) {
                System.out.println("Have a nice day!");
                System.exit(1);
            } else if (order.equalsIgnoreCase("Yes")) {
                System.out.println("Would you like a 'Large' or 'Regular'?");
                String size = scanner.next();

                if (size.equalsIgnoreCase("Large")) {
                    finalPrice = lrgsize;
                    System.out.println("You ordered a Large.");
                } else if (size.equalsIgnoreCase("Regular")) {
                    finalPrice = regsize;
                    System.out.println("You ordered a Regular.");
                } else {
                    System.out.println("Invalid size. Please type 'Large' or 'Regular'.");
                    continue;
                }

                // prompt for discount
                System.out.println("Please enter your age:");
                int age = scanner.nextInt();

                if (age <= 17) {
                    finalPrice = finalPrice * 0.90;
                    System.out.println("Student discount applied (10%)");
                } else if (age >= 65) {
                    finalPrice = finalPrice * 0.80;
                    System.out.println("Senior discount applied (20%)");
                }

                System.out.printf("Your final total is: $%.2f%n", finalPrice);
                break;

            } else {
                System.out.println("Error: Please try again.");
                    }
                }
            }
        }



