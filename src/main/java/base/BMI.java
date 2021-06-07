/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Arya Hirode
 */
package base;

import java.util.Scanner;

public class BMI {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        BMI bmi = new BMI();
        bmi.output();
    }

    private String weightPrompt() {
        System.out.print("What is your weight in pounds? ");
        return in.nextLine();
    }

    private String heightPrompt() {
        System.out.print("What is your height in inches? ");
        return in.nextLine();
    }

    private boolean isNumber(String w, String h) {
        try {
            int weight = Integer.parseInt(w);
            int height = Integer.parseInt(h);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private double calculations(double w, double h) {
        return (w / (h * h)) * 703;
    }

    private void output() {
        String weight = weightPrompt();
        String height = heightPrompt();
        if (!isNumber(weight, height)) {
            System.out.println("Please enter numeric data only.");
            return;
        }
        double bmi = calculations(Double.parseDouble(weight), Double.parseDouble(height));
        System.out.printf("Your BMI is %.1f.\n", bmi);
        if (bmi < 18.5) {
            System.out.println("You are underweight. You should see your doctor.");
        }
        else if (bmi > 25) {
            System.out.println("You are overweight. You should see your doctor.");
        }
        else {
            System.out.println("You are within the ideal weight range.");
        }

    }
}
