package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        int feet;
        int inches;

        keyboard = new Scanner(System.in);

        System.out.println("What is your height? (Only feet)");
        feet = keyboard.nextInt();

        System.out.println("What is your height? (Only inches)");
        inches = keyboard.nextInt();

        inches = inches + (feet * 12);








    }
}
