/* Chapter 3 Exercise 3.12 (Palindrome integer)

*	Modify Listing 2.10, ComputeChange.java, to display the nonzero denominations only, using 
*	singular words for single units such as 1 dollar and 1 penny, and plural words for more 
*	than one unit such as 2 dollars and 3 pennies.

@eddi-spaghetti 2021*/

import java.util.Scanner;
public class IntegerPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Prompt to get number user wants to check if a palindrome
        System.out.print("Enter a three-digit integer: ");
        int originalNum = input.nextInt();
        
        //Check if user entered a valid three-digit integer value (haven't learned a way to loop yet)
        if (originalNum > 999 || originalNum < -999) {
            System.out.print("Not a three-digit integer. Run program again.");
        }
        else {
            //Set new variable to value entered by user to avoid accidentally changing original value
            int tempNum = originalNum;
            
            int hundredsPlaceNum = tempNum / 100;   //Get number in hundreds place (integer drops any remainder)
            int onesPlaceNum = tempNum % 10;    //Get number in ones place
            
            //Display results
            if(hundredsPlaceNum == onesPlaceNum)  {  
               System.out.println(originalNum + " is a palindrome number.");
            }
            else {
               System.out.println(originalNum + " is not a palindrome number.");
            }
        }
    }
}