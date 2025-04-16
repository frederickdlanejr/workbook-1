package com.pluralsight;
import java.util.*;

public class PayrollCalculator {
    public static void main(String[] args){

        Scanner payroll = new Scanner(System.in);

        System.out.println("What is your name?");
        String name;
        name = payroll.nextLine();

        System.out.println("Please input your hourly pay rate: ");
        double hourlyWage = payroll.nextDouble();
        payroll.nextLine();

        System.out.println("Input hours worked: ");
        double hoursWorked = payroll.nextDouble();

        double grossPay;

        if (hoursWorked > 40)
            double regularWage = 40 * hourlyWage;
            double overtimePay = (hourlyWage * 1.5) + (hoursWorked - 40);

            grossPay = overtimePay + regularWage;

            else
            grossPay = hoursWorked * hourlyWage;
        }
        System.out.println("Hello! $s, you worked %.0f hours this week. Your gross pay will be %.0f.", name, hoursWorked, grossPay);

    }
}
