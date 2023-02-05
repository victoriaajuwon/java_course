package chapter5;

import java.util.Scanner;

/*
 * CHAPTER 5 EXERCISE: PHONE BILL CALCULATOR
 * Calculate the final total of someone's cell phone bill
 * Allow the operator to input the plan fee and the number of overage minutes
 * Charge the user 0.25 for every minute they were over their plan and 15% tax on
 * the subtotal
 * Create separate methods to calculate the tax, overage fees and final total
 * Print the itemized bill
 */
public class Exercise_PhoneBillCalculator {
    //Initiate what we know
    static double taxPercent = 0.15;
    static double pricePerMinute = 0.25;
    static Scanner scanner = new Scanner(System.in);

    public static void main (String[]args){

        double planFee = getBaseFee();
        int minutesOver = getOverage();
        double overageFee = calculateOverageFee(minutesOver);
        double subTotal = calculateSubtotal(planFee, overageFee);
        double tax = calculateTax(subTotal);
        double total = calculateFinalTotal(planFee,overageFee,tax);
        printBill(planFee, overageFee, tax, total);

    }

    public static double getBaseFee(){
        System.out.println("Enter your phone plan fee: ");
        double fee = scanner.nextDouble();
        return fee;
    }

    public static int getOverage(){
        System.out.println("Enter the number of minutes over: ");
        int minuteOver = scanner.nextInt();
        return minuteOver;
    }

    public static double calculateOverageFee(int minutesOver){
        double overage = pricePerMinute * minutesOver;
        return overage;
    }

    public static double calculateSubtotal(double baseFee, double overageFee){
        double subTotal = baseFee + overageFee;
        return subTotal;
    }
    public static double calculateTax(double sub){
        double tax = taxPercent * sub;
        return tax;
    }
    public static double calculateFinalTotal(double fee, double overFee, double tax){
        double total = fee + overFee + tax;
        return total;
    }
    public static void printBill(double planFee, double overageFee, double tax, double total){
        System.out.println("Phone Bill Statement: ");
        System.out.println("Plan fee: " +planFee);
        System.out.println("Overage: " +overageFee);
        System.out.println("Tax: " +tax);
        System.out.println("Total fee: " +total);
    }
}
