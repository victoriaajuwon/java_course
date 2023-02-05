package chapter6;

//import java.util.Scanner;

public class PhoneBill {
    // declaring fields as Global
    private String id;
    private double baseCost;
    private int allocatedMinutes;
    private int minutesUsed;
    private double taxPercent;
    private double pricePerMinute;
    //static Scanner scanner = new Scanner(System.in);

    //declaring default constructor
    public PhoneBill(){
        id = "000";
        baseCost = 0.0;
        allocatedMinutes = 0;
        minutesUsed = 0;
        taxPercent = 0.15;
        pricePerMinute = 0.2;
    }
    //declare constructor that accepts ids only
    public PhoneBill(String id){
        this.id = id;
    }

    public PhoneBill(String id, double baseCost, int allocatedMinutes, int minutesUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.allocatedMinutes = allocatedMinutes;
        this.minutesUsed = minutesUsed;

    }
    //setter method for id
    public void setId(String id){
        this.id = id;
    }
    //setter method for base cost
    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }
    //setter method for number of allocated minutes
    public void setAllocatedMinutes(int allocatedMinutes){
        this.allocatedMinutes = allocatedMinutes;
    }
    //setter method for number of minutes used
    public void setMinutesUsed(int minutesUsed){
        this.minutesUsed = minutesUsed;
    }

    //declaration of methods

    // declare method to calculate overage
    public int calculateOverage(int allocatedMinutes, int minutesUsed){
        int overage;
        if (minutesUsed > allocatedMinutes){
            return overage = minutesUsed - allocatedMinutes;
        }
        else return overage = 0;
    }

    // declare method to calculate overage Fee
    public double calculateOverageFee(int overage, double cost){
        double overageFee = overage * cost;
        double overageFee1 = overageFee;
        return overageFee1;
    }

    // declare method to calculate subtotal
    public double calculateSubTotal(double baseCost, double overFee){
        double subTotal = baseCost + overFee;
        return subTotal;
    }

    //declare method to calculate tax payment
    public double calculateTaxPayment(double sub, double taxPercent){
        double taxPayment = sub * taxPercent;
        return taxPayment;
    }

    //declare method to calculate total
    public double calculateTotalBill(double subtotal, double tax){
        double total;
        total = subtotal + tax;
        return total;
    }

    //declare method to print bill
    public static void printBill(String id, double planFee, double overageFee, double tax, double total){
        System.out.println("Phone Bill Statement: ");
        System.out.println("Phone Bill ID: " + id);
        System.out.println("Plan fee: " +planFee);
        System.out.println("Overage: " +overageFee);
        System.out.println("Tax: " +tax);
        System.out.println("Total fee: " +total);
    }

}
