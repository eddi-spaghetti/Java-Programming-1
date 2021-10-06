/* Chapter 5 Exercise 5.7 (Financial application: compute future tuition)

*	Suppose that the tuition for a university is $10,000 this year and increases 6% every year. *	In one year, the tuition will be $10,600. Write a program that computes the tuition in ten 
*	years and the total cost of four years' worth of tuition after the tenth year.

@eddi-spaghetti 2021 */

public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;                     //Year 0 tuition cost
        int year;                                   //Keep track of number of years
        final double TUITION_INCREASE = 1.06;       //Percentage increase in tuition each year
        double tuitionTotal = 0;
        for (year = 0; year < 13; year++) {
            tuition = tuition * TUITION_INCREASE;   //Calculate increase of tuition each year
            if (year >= 9 ) {
                tuitionTotal += tuition;            //Calculate total cost of 4 years of tuition after tenth year
            }
        }       
        
        System.out.printf("Total cost of four years of tuition after 10 years of inflation: $%.2f \n", tuitionTotal);
    }
}