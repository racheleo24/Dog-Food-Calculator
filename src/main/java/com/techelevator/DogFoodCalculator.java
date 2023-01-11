package com.techelevator;

import java.util.Scanner;

public class DogFoodCalculator {

    public static void main(String[] args) {

        System.out.println("*********************************");
        System.out.println("-------------Welcome-------------");
        System.out.println("-----to Dog Food Calculator!-----");
        System.out.println("*********************************");
        System.out.println();

        // Initialize scanner
        Scanner input = new Scanner(System.in);

        // Prompt user for inputs
        System.out.println("Please enter your dog's weight (numerical value): ");
        String weightInput = input.nextLine();

        System.out.println("Please enter 'kg' or 'lbs': ");
        String measurementType = input.nextLine();

        System.out.println("How many times per day does your dog eat? ");
        String inputMeals = input.nextLine();

        // Convert weight
        final double LBS_TO_KG_CONVERSION = 0.454;
        final double KG_TO_LBS_CONVERSION = 2.205;

        Double weightInLbs = 0.0;
        Double weightInKgs = 0.0;

        Double weight = Double.parseDouble(weightInput);
        if (measurementType.equals("kg")) {
            weightInKgs = weight;
            weightInLbs = weight*KG_TO_LBS_CONVERSION;
        }
        if (measurementType.equals("lbs")) {
            weightInLbs = weight;
            weightInKgs = weight*LBS_TO_KG_CONVERSION;
        }

        // Determine goal cups per day
        double cupsPerDay = 0.0;
        if (weightInLbs <= 3.0) {
            cupsPerDay = (1.0/3.0);
        }
        else if (weightInLbs <= 6.0) {
            cupsPerDay = 1.0/2.0;
        }
        else if (weightInLbs <= 10.0){
            cupsPerDay = 3.0/4.0;
        }
        else if (weightInLbs <= 15.0) {
            cupsPerDay = 1.0;
        }
        else if (weightInLbs <= 20.0) {
            cupsPerDay = 4.0/3.0;
        }
        else if (weightInLbs <= 30.0){
            cupsPerDay = 7.0/4.0;
        }
        else if (weightInLbs <= 40.0) {
            cupsPerDay = 9.0/4.0;
        }
        else if (weightInLbs <= 50.0){
            cupsPerDay = 8.0/3.0;
        }
        else if (weightInLbs <= 60.0) {
            cupsPerDay = 3.0;
        }
        else if (weightInLbs <= 70.0) {
            cupsPerDay = 7.0/2.0;
        }
        else if (weightInLbs <= 80.0){
            cupsPerDay = 15.0/4.0;
        }
        else if (weightInLbs <= 90.0){
            cupsPerDay = 17.0/4.0;
        }
        else if (weightInLbs <= 100.0){
            cupsPerDay = 9.0/2.0;
        }

        // Determine goal cups per meal
        Integer numberOfMeals = Integer.parseInt(inputMeals);
        Double cupsPerMeal = (cupsPerDay/(double)numberOfMeals);

        // Return info to the user
        System.out.println("\nYour dog weighs " + weightInLbs + " pounds and " + weightInKgs + " kilograms.");
        System.out.println("They should be fed " + cupsPerDay + " cups per day.");
        System.out.println("On your current meal plan, they should eat " + cupsPerMeal + " per " + numberOfMeals + " meals daily.");

    }
}
