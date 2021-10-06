/* Chapter 7 Exercise 7.17 (Sort students)

*	Write a program that prompts the user to enter the number of students, the students' names, 
*	and their scores and prints student names in decreasing order of their scores. Assume the 
*	name is a string without spaces, use the Scanner's next() method to read a name.

@eddi-spaghetti 2021 */

import java.util.Scanner;
public class SortStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        
        String[] studentName = new String[numStudents];       //Array to hold student names
        int[] studentScore = new int[numStudents];            //Array to hold student scores
        
        //Loop to get each students' name and score
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student #"+ (i + 1) + " name without spaces: " );
            studentName[i] = input.next();
            System.out.print("Enter student #"+ (i + 1) + " score in points: " );
            studentScore[i] = input.nextInt();
        }

        //Call method that sorts students & scores
        sort(studentName, studentScore);
    }
    //Method to sort students & scores from lowest to highest then display them in decreasing order
    public static void sort(String[] name, int[] score) {
        
        //Loop through arrays
        for (int i = 0; i < score.length - 1; i++) {
            String currentMinName = name[i];
            int currentMinScore = score[i];
            int currentMinIndex = i;
            
            //Loop through remaining scores to find smallest
            for (int j = i + 1; j < score.length; j++) {
                if (currentMinScore > score[j]) {
                    currentMinScore = score[j];
                    currentMinName = name[j];
                    currentMinIndex = j;
                }
            }
            //Swap smallest to current position
            if (currentMinIndex != i) {
                name[currentMinIndex] = name[i];
                score[currentMinIndex] = score[i];
                name[i] = currentMinName;
                score[i] = currentMinScore;
            }
        }
        //Display student names and scores in decreasing order of their score 
        for (int i = name.length - 1; i >= 0; i--) {
            System.out.printf("%9s%-20s%18s%5d\n", "Student: ", name[i], " Score in Points: ", score[i]);
        }
    }
}