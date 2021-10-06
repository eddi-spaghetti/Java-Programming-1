/* Chapter 2 Exercise 2.10 (Science: Calculating Energy)

*	Write a program that calculates the energy needed to heat water from an initial temperature
*	to a final temperature. Your program should prompt the user to enter the amount of water in 
*	kilograms and the initial and final temperatures of the water. The formula to compute the 
*	energy is Q = M * (finalTemperature – initialTemperature) * 4184

*	Where M is the weight of water in kilograms, initial and final temperatures are in degrees
*	Celsius, and energy Q is measured in joules.

@eddi-spaghetti 2021*/

import java.util.Scanner; //Scanner is in the java.util package

public class CalculateEnergy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create Scanner object to read input
        
        final int WATER_HEAT_CAPACITY = 4184;	//Constant variable for the heat capacity of water
        
        //Prompt user for input
        System.out.print("Enter the amount of water in kilograms: ");
        double waterWeightKilos = input.nextDouble();
        
        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemp = input.nextDouble();
        
        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemp = input.nextDouble();
        
        //Formula to calculate the energy needed to heat water
        double energyJoules = waterWeightKilos * (finalTemp - initialTemp) * WATER_HEAT_CAPACITY;
        
        //Display results
        System.out.println("The energy needed is " + energyJoules + " joules.");
    }
}