/* Chapter 4 Exercise 4.7 (Corner point coordinates)

*	Suppose a pentagon is centered at (0,0) with one point at the 0 o'clock position, as shown 
*	in Figure 4.4c. Write a program that prompts the user to enter the radius of the bounding 
*	circle of a pentagon and displays the coordinates of the five corner points on the pentagon 
*	from p1 to p5 in this order. Use console format to display two digits after the decimal point.

@eddi-spaghetti 2021*/

import java.util.Scanner;
public class PentagonPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Prompt user for input
        System.out.print("Enter the radius of the bounding circle of a pentagon: ");
        double radius = input.nextDouble();
        
        if (radius <= 0) {  //Check if radius is valid
            System.out.println("Please enter a valid radius. Rerun program.");
        }
        else {
            System.out.println("The coordinates of five points on the pentagon are:");  //Display results to user

            //Variables to hold point coordinates
            double xPoint1, yPoint1, xPoint2, yPoint2, xPoint3, 
                    yPoint3, xPoint4, yPoint4, xPoint5, yPoint5;

            final double NUM_POINTS = 5.0;   //Pentagon has 5 points
            int currentPoint = 1;            //Hold current point

            //Calculate pentagon point coordinates & display each set of coordinates (redo as a loop for less redundancy)
            xPoint1 = radius * Math.sin(2.0 * Math.PI / NUM_POINTS * currentPoint);     //Get x coordinate of pentagon point
            yPoint1 = radius * Math.cos(2.0 * Math.PI / NUM_POINTS * currentPoint--);   //Get y coordinate of pentagon point, Subtract currentPoint to move counterclockwise to next point
            System.out.printf("(%.2f, %.2f)\n", xPoint1, yPoint1);                      //Display x & y coordinates of pentagon point, formatted

            xPoint2 = radius * Math.sin(2.0 * Math.PI / NUM_POINTS * currentPoint);
            yPoint2 = radius * Math.cos(2.0 * Math.PI / NUM_POINTS * currentPoint--);
            System.out.printf("(%.2f, %.2f)\n", xPoint2, yPoint2);

            xPoint3 = radius * Math.sin(2.0 * Math.PI / NUM_POINTS * currentPoint);
            yPoint3 = radius * Math.cos(2.0 * Math.PI / NUM_POINTS * currentPoint--);
            System.out.printf("(%.2f, %.2f)\n", xPoint3, yPoint3);

            xPoint4 = radius * Math.sin(2.0 * Math.PI / NUM_POINTS * currentPoint);
            yPoint4 = radius * Math.cos(2.0 * Math.PI / NUM_POINTS * currentPoint--);
            System.out.printf("(%.2f, %.2f)\n", xPoint4, yPoint4);

            xPoint5 = radius * Math.sin(2.0 * Math.PI / NUM_POINTS * currentPoint);
            yPoint5 = radius * Math.cos(2.0 * Math.PI / NUM_POINTS * currentPoint);
            System.out.printf("(%.2f, %.2f)\n", xPoint5, yPoint5);
        }
    }
}