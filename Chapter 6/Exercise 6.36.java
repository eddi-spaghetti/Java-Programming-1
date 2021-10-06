/* Chapter 6 Exercise 6.36 (Geometry: area of a regular polygon)

*	A regular polygon is an n-sided polygon in which all sides are of the same length and all 
*	angles have the same degree (i.e., the polygon is both equilateral and equiangular). The 
*	formula for computing the area of a regular polygon is Area = (n * s^2) / (4 * tan(pi / n))

*	 Write a method that returns the area of a regular polygon using the following header:

*	public static double area(int n, double side)

*	Write a main method that prompts the user to enter the number of sides and the side of a 
*	regular polygon and displays its area.

@eddi-spaghetti 2021 */

import java.util.Scanner;
public class RegPolygonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numSides = 0;
        
        do {
            //Prompt user for number of sides the polygon has
            System.out.print("How many sides does the regular polygon have? ");
            numSides = input.nextInt();
            
            //Check if valid polygon
            if (numSides < 3) {
                System.out.println("Please enter a valid polygon.");
            }
        } while (numSides < 3);
        
        //Prompt user for unit of measurement of a side of the polygon
        System.out.print("What unit is used to measure the polygon side? (ex: inches, ft) ");
        String unitMeasurement = input.next();
        
        //Prompt user for length of a side of the polygon
        System.out.print("What is the length of one side of the polygon in " + unitMeasurement + "? All sides must be equal. ");
        double sideLength = input.nextDouble();
        
        //Display results to user
        System.out.printf("The area of the polygon is %.2f %s %s\n", area(numSides, sideLength), unitMeasurement, "squared");
	}
    //Method with forumla to calculate the area of the polygon
    public static double area(int n, double side) {
        double area = (n * Math.pow(side, 2)) / (4 * (Math.tan(Math.PI / n)));
        return area;
    }
}