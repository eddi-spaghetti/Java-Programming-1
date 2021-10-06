/* Chapter 4 Exercise 4.5 (Geometry: area of a regular polygon)

*	A regular polygon is an n-sided polygon in which all sides are of the same length and all 
*	angles have the same degree (i.e., the polygon is both equilateral and equiangular). The 
*	formula for computing the area of a regular polygon is Area = (n * s^2) / (4 * tan(pi/n))

*	Here, s is the length of a side. Write a program that prompts the user to enter the number 
*	of sides and their length of a regular polygon and displays its area.

@eddi-spaghetti 2021*/

import java.util.Scanner;
public class RegPolygonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Prompt user for number of sides the polygon has
        System.out.print("How many sides does the regular polygon have? ");
        int numSides = input.nextInt();
        
        if (numSides < 3) {
            System.out.println("Please enter a valid polygon. Rerun program.");
        }
        
        //Prompt user for unit of measurement of a side of the polygon
        System.out.print("What unit is used to measure the polygon side? (ex: inches, ft) ");
        String unitMeasurement = input.next();
        
        //Prompt user for length of a side of the polygon
        System.out.print("What is the length of one side of the polygon in " + unitMeasurement + "? All sides must be equal. ");
        double sideLength = input.nextDouble();
        
        //Forumla to calculate the area of the polygon
        double area = (numSides * Math.pow(sideLength, 2)) / (4 * (Math.tan(Math.PI / numSides)));
        
        //Display results to user
        System.out.printf("%s%.2f%s%s\n", "The area of the polygon is ", area, unitMeasurement, "squared");
        }
    }
}