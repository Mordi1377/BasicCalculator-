package com.pluralsight;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number ");
        float number1 = input.nextFloat();

        System.out.println("Enter the second number ");
        float number2 = input.nextFloat();

        System.out.println("\nResults:");
        System.out.println("Addition: " + number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println("Subtraction: " + number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println("Multiplication: " + number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println("Division: " + number1 + " / " + number2 + " = " + (number1 / number2));

        input.close();


    }
}
