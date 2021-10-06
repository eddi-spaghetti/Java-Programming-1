/* Part 1 – Calculating Sales

*	An online retailer sells five products whose retail prices are as follows: Product 1, $2.98; product 
*	2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87. Write an application that reads a 
*	series of pairs of numbers as follows:

*	a) product number
*	b) quantity sold

*	Your program should use a switch statement to determine the retail price for each product. It should 
*	calculate and display the total retail value of all products sold. Use a sentinel-controlled loop to 
*	determine when the program should stop looping and display the final results.

@eddi-spaghetti 2021 */

import java.util.Scanner;
public class CalculatingSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double totalRetailValue = 0;    //To hold total retail value of all products sold
        boolean again = true;           //To check for more sales
        
        //Show user valid product numbers
        System.out.println("Product Numbers:\n"
                         + "Product 1\n"
                         + "Product 2\n"
                         + "Product 3\n"
                         + "Product 4\n"
                         + "Product 5\n");
        
        //Get each product and quantity sold
        while (again) {
            System.out.println("Enter product number followed by a space and quantity sold. "
                             + "Enter 0 for both to display total.");
            int productNum = input.nextInt(),
                quantitySold = input.nextInt();
            
            //Sentinal values to end loop. Treats single zero as a typo instead of end.
            if (productNum == 0) {
                if (quantitySold == 0) {
                    break;
                }
            }
            //Check for negative values (invalid numbers)
            else if (productNum < 0 || quantitySold < 0) {
                System.out.println("Enter valid product number and/or quantity.");
                continue;
            }
            
            //Calculate total of current product value
            double currentTotal = productCosts(productNum, quantitySold);
            
            System.out.printf("%s%.2f\n", "Value of last entry is $", currentTotal);
            
            totalRetailValue += currentTotal;   //Add current product value to total value
        }
        System.out.printf("%s$%.2f\n", "Total retail value of all products sold: ", totalRetailValue);
    }
    //Find product and calculate total of current product value
    public static double productCosts(int productNum, int quantity) {
        double productCost = 0;
        
        if (quantity == 0) {
            System.out.println("Enter valid quantity.");
        }
        else {
            switch(productNum) {
                case 1: {
                    productCost = 2.98;     //Product 1
                    break;
                }
                case 2: {
                    productCost = 4.50;     //Product 2
                    break;
                }
                case 3: {
                    productCost = 9.98;     //Product 3     
                    break;
                }
                case 4: {
                    productCost = 4.49;     //Product 4
                    break;
                }
                case 5: {
                    productCost = 6.87;     //Product 5
                    break;
                }
                case 0:                     //Fall through
                default : {
                    System.out.println("Enter valid product.");
                    break;
                }
            }
        }
        return productCost * quantity;      //Calculate & return total value of current entry
    }
}