/* Chapter 4 Exercise 4.14 (Convert letter grade to number)

*	Write a program that prompts the user to enter a letter grade A, B, C, D, or F and displays 
*	its corresponding numeric value 4, 3, 2, 1, or 0. For other input, display invalid grade.

@eddi-spaghetti 2021*/

import java.util.Scanner;
public class LetterGradeToNumValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a letter grade (A, B, C, D, or F): ");
        char letterGrade = input.next().charAt(0);
        
        //Convert entry to upper case
        char chLetterGrade = Character.toUpperCase(letterGrade);
        int numGrade;   //variable to hold corresponding numeric value
        
        //Check if letter grade matches & set numeric value
        switch (chLetterGrade) {
            case 'A': {
                numGrade = 4;
                break;
            }
            case 'B': {
                numGrade = 3;
                break;
            }
            case 'C': {
                numGrade = 2;
                break;
            }
            case 'D': {
                numGrade = 1;
                break;
            }
            case 'F': {
                numGrade = 0;
                break;
            }
            default: {
                numGrade = -1;  //All invalid grades caught here
            }
        }
        //Check if grade is valid
        if (numGrade < 0) {
            System.out.println(chLetterGrade + " is an invalid grade.");
        }
        else {
            System.out.println("The numeric value for grade " + chLetterGrade + " is " + numGrade);
        }
    }
}