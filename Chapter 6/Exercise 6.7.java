/* Chapter 6 Exercise 6.7 (Financial application: compute the future investment value)

*	Write a method that computes future investment value at a given interest rate for a 
*	specified number of years. The future investment is determined using the formula in 
*	Programming Exercise 2.21.

*	Use the following method header:
*	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)

*	For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.

*	Write a test program that prompts the user to enter the investment amount (e.g., 1,000) and 
*	the interest rate (e.g., 9%) and prints a table that displays future value for the years 
*	from 1 to 30

@eddi-spaghetti 2021 */

import java.util.Scanner;
public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter initial investment amount in USD: $");  //Get initial investment amount
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate percentage: ");    //Get annual interest rate in percentage
        double annualInterestRate = input.nextDouble() / 100;           //Convert interest rate to decimal format

        System.out.printf("%3s%25s\n", "Years", "Future Value in USD"); //Display header row
        //Display loop for investment value based on number of years
        for (int years = 1; years <= 30; years++) {
            System.out.printf("%-4d%20.2f\n", years, 
                    futureInvestmentValue(investmentAmount, annualInterestRate / 12, years));
        }
    }    
    //Method to calulate future value of investment based on interest rate & number of years
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int numberOfYears) {
        return investmentAmount * Math.pow((1 + monthlyInterestRate),(numberOfYears * 12));
    }
}