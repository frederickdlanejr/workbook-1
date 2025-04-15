package com.pluralsight;

import java.util.*;

public class Calculator{

public static void main(String[] args){


    Scanner DoMath = new Scanner(System.in);

    System.out.println("Enter the first number: ");
    float number1 =  DoMath.nextFloat();

    System.out.println("Enter the second number: ");
    float number2 = DoMath.nextFloat();



    System.out.println("What did you want to do?");
    System.out.println(" Enter \"A\" for Addition, \"S\" for Subtraction, \"D\" for Division and \"M\" for Multiplication: ");
    DoMath.nextLine();

    float product = number1 * number2;
    System.out.printf("The product of %.2f and %.2f is %.2f", number1, number2, product);
}
}
