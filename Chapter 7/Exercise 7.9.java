/* Chapter 7 Exercise 7.9 (Find the smallest element)

*	Write a method that finds the smallest element in an array of double values using the following header:

*	public static double min(double[] array)

*	Write a test program that prompts the user to enter 10 numbers, invokes this method to return the minimum value, and displays the minimum value.

@eddi-spaghetti 2021 */

import java.util.Scanner;
public class FindSmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final int SIZE = 10;                    //Fixed array size
        
        double[] numbers = new double[SIZE];    //Create array to hold values
        
        //Get input to fill array
        System.out.print("Enter " + SIZE + " numbers separated by a space: ");
        for (int i = 0; i < SIZE; i++) {
            numbers[i] = input.nextDouble();
        } 
        
        //Call method to find then display minimum value
        System.out.println("The minimum number is: " + getMin(numbers));
    }
    //Method to check each element in array to find the minimum value
    public static double getMin(double[] array) {
        double minimum = array[0];              //Assign initial check point
        
        //Check if each element is smaller than current minimum
        for (int i = 0; i < array.length; i++) {
            if (minimum > array[i]) {
                minimum = array[i];
            }
        }
        return minimum;
    }
}