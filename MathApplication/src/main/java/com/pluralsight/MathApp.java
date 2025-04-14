package com.pluralsight;

public class MathApp  {

    public static void main(String[] args){

        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        //Question 1:
        double bobSalary = 70000;
        double garySalary = 85000;

        double highestSalary;

        highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The answer is " + highestSalary);

        //Question 2:
        int carPrice = 6000;
        int truckPrice = 7500;

        int cheaperVehicle;

        cheaperVehicle = Math.min(carPrice, truckPrice);
        System.out.println("The answer is " + cheaperVehicle);



        //Question 3:
        double radius = 2.75;

        double area = radius * radius * Math.PI;
        System.out.println("The answer is " + area);




        //Question 4:
        double number = 5;

        double squareRoot = Math.sqrt(number);
        System.out.println("The answer is "+ squareRoot);



        //Question 5
        int pointAX = 5;
        int pointAY = 10;
        int pointBX = 85;
        int pointBY = 50;

        double distance = Math.sqrt(Math.pow(pointBX - pointAX,2) + Math.pow(pointBY - pointAY,2));

        System.out.println("The distance is "+ distance);


        //Question 6
        double Value = -3.8;
        double absoluteValue = Math.abs(Value);

        System.out.println("The answer is " + absoluteValue);

        //Question 7
        System.out.println("Random number is " + Math.random());

    }
}
