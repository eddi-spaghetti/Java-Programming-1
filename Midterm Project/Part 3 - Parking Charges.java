/* Part 3– Parking Charges

*	A parking garage charges a $2.00 minimum fee to park for up to three hours. The garage 
*	charges an additional $0.50 per hour for each hour or part thereof in excess of three 
*	hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks 
*	for longer than 24 hours at a time. 

*	Write an application that calculates and displays the parking charges for each customer 
*	who parked in the garage yesterday. You should enter the hours parked for each customer. 
*	The program should display the charge for the current customer and should calculate and 
*	display the running total of yesterday’s receipts.

@eddi-spaghetti 2021 */

import java.util.Scanner;
public class ParkingCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double totalCharges = 0;

        //Main loop to get input
        while (true) {
            System.out.print("Enter hours parked or zero to end: ");
            int hoursParked = input.nextInt();
            
            if (hoursParked == 0) {                     //Condition to exit loop
                break;
            }
            else if (hoursParked < 0) {                 //User entered negative hours
                System.out.println("Invalid hours.");
                continue;                               //Ask for input again
            }
            else if (hoursParked > 24) {
                hoursParked = 24;                       //ASSUME 24 hours max
                System.out.println("Max daily hours is 24, defaulting to max charge.");
            }
        
        //Call method to calculate charges and assign value to current charge
        double currentCharge = CalculateCharges(hoursParked);
        
        totalCharges += currentCharge;  //Add current charge to the running total
        
        System.out.printf("%s%.2f%s%.2f\n", "The current charge is $", currentCharge, 
                          " Total charges yesterday $", totalCharges);
        }
    }
    //Method to calculate current charge
    public static double CalculateCharges(int hours) {
        final double ADD_HOUR_FEE = .50,     //Fee for each additional hour after minimum
                     MIN_CHARGE = 2.00,      //Minimum parking fee, up to 3 horus   
                     MAX_CHARGE = 10.00;     //Maximum parking fee, for up to 24 hours
        double currentCharge;
        
        //Calculate charge for total hours
        if (hours <= 3) {
            currentCharge = MIN_CHARGE;
        }
        else {
            currentCharge = ((hours - 3)* ADD_HOUR_FEE) + MIN_CHARGE;
        }
        
        //Limit charge to max charge
        if (currentCharge > MAX_CHARGE) {
            currentCharge = MAX_CHARGE;
        }
        return currentCharge;
    };
}