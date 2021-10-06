/* Part 2 – Account Saving Checking

*	A bank in your town updates its customers’ accounts at the end of each month. The bank 
*	offers two types of accounts: savings and checking. Every customer must maintain a minimum 
*	balance. If a customer’s balance falls below the minimum balance, there is a service *
*	charge of $10.00 for savings accounts and $25.00 for checking accounts. If the balance at 
*	the end of the month is at least the minimum balance, the account receives [ANNUAL] 
*	interest as follows:

*	a) Savings accounts receive 4% interest. [ANNUAL INTEREST RATE (divide by 12)]
*	b) Checking accounts with balances of up to $5000 more than the mini- mum balance receive 
*	3% interest; otherwise, the interest is 5%. [ANNUAL INTEREST RATE (divide by 12)]

*	Write a program that reads a customer’s account number (int type), account type (char 
*	type; s or S for savings, c or C for checking), minimum balance that the account should 
*	maintain, and current balance. The program should then output the account number, account 
*	type, current balance, and new balance or an appropriate error message. Test your program 
*	by running it five times, using the following data:

*	46728 S 1000 2700
*	87324 C 1500 7689
*	873 S 1000 800
*	89832 C 2000 3000
*	98322 C 1000 750

@eddi-spaghetti 2021*/

import java.util.Scanner;
public class BankingAccounts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter account number: ");
        int accountNum = input.nextInt();
        
        char accountType = ' ';
        
        //Get valid input for account type
        while (accountType != 's' && accountType != 'S' && accountType != 'c' && accountType != 'C') {
            System.out.print("Enter valid account type (S = Savings, C = Checking): ");
            accountType = input.next().charAt(0);
        }
        
        System.out.print("Enter minimum balance in USD: ");
        double minBalance = input.nextDouble();
        
        System.out.print("Enter current balance in USD: ");
        double currentBalance = input.nextDouble();
        
        //Calculations to get new balance
        double newBalance = getNewBalance(accountType, minBalance, currentBalance);
        
        System.out.printf("%-20s\t%d\n%-20s\t%c\n%-20s\t%.2f\n%-20s\t%.2f\n", 
                          "Account Number:", accountNum, "Account Type:", accountType, 
                          "Current USD Balance:", currentBalance, "New USD Balance:", newBalance);
    }
    //Check account type & determine account action based on current balance & minimum amount
    public static double getNewBalance(char aType, double minBal, double cBal) {
        final double CHECKING_FEE = 25.00;
        final double SAVINGS_FEE = 10.00;
        final double SAVINGS_MONTHLY_INTEREST_RATE = .04/12;    //4% annual interest rate for savings account, applied monthly
        final double CHECKING_REG_MONTHLY_INTEREST_RATE = .03/12;    //3% annual interest rate for regular checking up to $5000 more than minimum, applied monthly
        final double CHECKING_OVER_5000_MIN_MONTHLY_INTEREST_RATE = .05/12;    //3% annual interest rate for regular checking up to $5000 more than minimum, applied monthly
        
        //Savings Account tree
        if (aType == 's' || aType == 'S') {
            if (cBal < minBal) {
                cBal -= SAVINGS_FEE;
            }
            else {
                cBal += cBal * SAVINGS_MONTHLY_INTEREST_RATE;
            }
        }
        //Checking Account tree
        else {
            if (cBal < minBal) {
                cBal -= CHECKING_FEE;
            }
            else if (cBal <= (minBal + 5000)) {
                cBal += cBal * CHECKING_REG_MONTHLY_INTEREST_RATE;
            }
            else {
                cBal += cBal * CHECKING_OVER_5000_MIN_MONTHLY_INTEREST_RATE;
            }
        }
        return cBal;
    }
}