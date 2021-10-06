/* Chapter 6 Exercise 6.11 (Financial application: compute commissions)

*	Write a method that computes the commission, using the scheme in Programming Exercise 5.39. The header of the method is as follows:

*	public static double computeCommission(double salesAmount)

*	Write a test program that displays a table

@eddi-spaghetti 2021 */

public class SalesCommission {
    public static void main(String[] args) {
        
        //Display header
        System.out.printf("%-15s%15s\n%s\n", "Sales Amount", "Commission","-------------------------------");
        
        //Loop to display sales amount and corresponding commission
        for (int salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
            System.out.printf("%-6d%21.1f\n", salesAmount, computeCommission(salesAmount));
        }
    }
    /*Method to compute commission using 8% baseline for first $5000,
        scaling to 10% for up to $10k and 12% for any remaining amount over $10k*/
    public static double computeCommission(double salesAmount) {
        double commission;
        final double COMMISSION_RATE_LESS_FIVE_THOUSAND = .08;
        final double COMMISSION_RATE_FIVE_TO_TEN_THOUSAND = .1;
        final double COMMISSION_RATE_OVER_TEN_THOUSAND = .12;
        
        if (salesAmount >= 10000.01) {
            commission = (5000 * COMMISSION_RATE_LESS_FIVE_THOUSAND) + (5000 * COMMISSION_RATE_FIVE_TO_TEN_THOUSAND) + (salesAmount - 10000.0) * COMMISSION_RATE_OVER_TEN_THOUSAND;
        }
        else {
            commission = (5000 * COMMISSION_RATE_LESS_FIVE_THOUSAND) + (salesAmount - 5000.0) * COMMISSION_RATE_FIVE_TO_TEN_THOUSAND;
        }
        return commission;
    }
}