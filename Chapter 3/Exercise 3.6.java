/* Chapter 3 Exercise 3.6 (Health application: BMI)

*	Revise Listing 3.4, ComputeAndInterpretBMI.java, to let the user enter weight, feet, and 
*	inches. For example, if a person is 5 feet and 10 inches, you will enter 5 for feet and 10 
*	for inches.

@eddi-spaghetti 2021*/

import java.util.Scanner;
public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        //Prompt the user to enter height in feet
        System.out.print("Enter height in feet (inches will be entered separately): ");
        double fheight = input.nextDouble();
        
        // Prompt the user to enter height in inches
        System.out.print("Enter remaining height in inches: ");
        double iheight = input.nextDouble();
        
        final double INCHES_PER_FOOT = 12;  //Constant, number of inches in a foot
        
        //Convert height of feet & inches to inches only
        double height = (fheight * INCHES_PER_FOOT) + iheight;
        
        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant

        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms /
        (heightInMeters * heightInMeters);

        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
        System.out.println("Underweight");
        else if (bmi < 25)
        System.out.println("Normal");
        else if (bmi < 30)
        System.out.println("Overweight");
        else
        System.out.println("Obese");
    }
}