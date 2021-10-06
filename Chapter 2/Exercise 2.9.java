/* Chapter 2 Exercise 2.9 (Physics: Acceleration)

*	Average acceleration is defined as the change of velocity divided by the time taken to make 
*	the change, as given by the following formula: a = (v1 – v0)/t

*	Write a program that prompts the user to enter the starting velocity v0 in meters/second, 
*	the ending velocity v1 in meters/second, and the time span t in seconds, then displays the 
*	average acceleration. 

@eddi-spaghetti 2021*/

import java.util.Scanner; //Scanner is in the java.util package
public class Acceleration {
    public static void main(String[] args) {
        //Create Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        //Declare variable
        double avgAcceleration;
        
        //Prompt user to enter velocity & time numbers
        System.out.println("Enter the starting and ending velocity in meters/second separated by a space, and the time span in seconds");
        double startVelocity = input.nextDouble(), 
               endVelocity = input.nextDouble(),
               timeSeconds = input.nextDouble();
        
        //Calculate the average acceleration
        avgAcceleration = (endVelocity - startVelocity) / timeSeconds;
        
        //Display results
        System.out.println("The average acceleration is " + avgAcceleration + " meters/second");
    }
}