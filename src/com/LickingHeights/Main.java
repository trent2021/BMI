package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        int feet;
        int inches;
        int pounds;
        double kilograms;
        double meters;
        double BMI;

        keyboard = new Scanner(System.in);

        System.out.println("What is your height? (Only feet)");
        feet = keyboard.nextInt();

        System.out.println("What is your height? (Only inches)");
        inches = keyboard.nextInt();

        System.out.println("What is your weight? (In pounds)");
        pounds = keyboard.nextInt();

        inches = inches + (feet * 12);
        meters = inches * 0.0254;
        kilograms = pounds * 0.453592;

        BMI = kilograms/(meters * meters);

        System.out.println("Your BMI is ");
        System.out.print(BMI);
    }
}
