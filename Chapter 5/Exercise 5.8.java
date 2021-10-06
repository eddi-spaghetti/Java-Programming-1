/* Chapter 5 Exercise 5.8 (Find the highest score)

*	Write a program that prompts the user to enter the number of students and each student's 
*	name and score, and finally displays the name of the student with the highest score. Use the 
*	next() method in the Scanner class to read a name, rather than using the nextLine() method.

@eddi-spaghetti 2021 */

import java.util.Scanner;
public class FindHighScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        
        //Variables to hold highest score and student name
        String topScoreName = "";
        int topScore = 0;
        
        //Loop to get data for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the first and last name of student #" + (i+1) + " separated by a space: ");
            String fName = input.next();
            String lName = input.next();
            
            System.out.print("Enter " + fName + " " + lName + " score: ");
            int score = input.nextInt();
            
            //Check to see if current student is the highest scorer
            if (score > topScore) {
                topScoreName = (fName + " " + lName);
                topScore = score;
            }
            //Check if there is a tie for highest score & concatenate student name
            else if (score == topScore) {               
                topScoreName += (", " + fName + " " + lName);
            }
        }
        System.out.println("The student(s) with the highest score: " + topScoreName);
    }
}