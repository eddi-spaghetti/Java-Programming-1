/* Chapter 7 Exercise 7.14 (Computing gcd)

*	Write a method that returns the gcd of an unspecified number of integers. The method header 
*	is specified as follows:

*	public static int gcd(int... numbers)

*	Write a test program that prompts the user to enter five numbers, invokes the method to find the gcd of these numbers, and displays the gcd.

@eddi-spaghetti 2021 */

import java.util.Scanner;
public class ComputingGCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final int SIZE = 5;                 //Fixed array size
        int[] numbers = new int[SIZE];      //Array to hold input                    

            System.out.print("Enter " + SIZE + " integers to get their gcd: ");
            for (int i = 0; i < numbers.length; i++) {
                //Convert all numbers to absolute value for gcd calculation
                numbers[i] = Math.abs(input.nextInt()); 
            }
            
        //Call method to find then display minimum value
        System.out.println("The GCD is " + gcd(numbers));
    }
    //Method to find the greatest common divisor (gcd)
    public static int gcd(int... numbers) {
        int gcd = 0;    //Default value is used only if all numbers are zero
        int smallestNum = getSmallestNum(numbers);
        
        /*Loop through numbers from one to the smallest number in set
        gcd cannot be greater than the smallest number*/
        for (int i = 1; i <= smallestNum; i++) {
            int count = 0;
            //Loop through set of numbers
            for (int j = 0; j < numbers.length; j++) {
                //Check for divisibility
                if (numbers[j] % i == 0) {
                    count++;
                    //Check if i can divide the whole set
                    if (count == numbers.length) {
                        gcd = i;
                    }
                }
            }
        }
        return gcd;
    }
    //Method to find the minimum value
    public static int getSmallestNum(int[] nums) {
        int smallestNum = nums[0];
        //Loop to check each element against current minimum value
        for (int i = 0; i < nums.length; i++) {
            /*Check if current position is smallest
            ignore zero because zero is divisible by every number*/
            if (smallestNum > nums[i] && nums[i] != 0) {
                smallestNum = nums[i];
            }
        }
        return smallestNum;
    }
}