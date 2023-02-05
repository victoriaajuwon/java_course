package chapter6;

public class PhoneBillCalculatorRedo {

    public static void main(String[]args){

        /*****************
         * Phone Bill 1
         */

        //Create instance of Phone bill class
        PhoneBill bill1 = new PhoneBill();
        bill1.setId("001");
        bill1.setBaseCost(25.75);
        bill1.setAllocatedMinutes(500);
        bill1.setMinutesUsed(600);
        int overageMinutes1 = bill1.calculateOverage(500, 600);
        double overagePayment1 = bill1.calculateOverageFee(overageMinutes1, 25.75);
        double subTotal1 = bill1.calculateSubTotal(25.75, overagePayment1);
        double tax1 = bill1.calculateTaxPayment(subTotal1, 0.15);
        double billTotal1 = bill1.calculateTotalBill(subTotal1,tax1);
        bill1.printBill("001",25.75,overagePayment1,tax1,billTotal1);

        /*****************
         * Phone Bill 2
         */

        //Create instance of Phone bill class
        PhoneBill bill2 = new PhoneBill();
        bill2.setId("002");
        bill2.setBaseCost(25.75);
        bill2.setAllocatedMinutes(500);
        bill2.setMinutesUsed(500);
        int overageMinutes2 = bill2.calculateOverage(500, 500);
        double overagePayment2 = bill2.calculateOverageFee(overageMinutes2, 25.75);
        double subTotal2 = bill2.calculateSubTotal(25.75, overagePayment2);
        double tax2 = bill1.calculateTaxPayment(subTotal2, 0.15);
        double billTotal = bill1.calculateTotalBill(subTotal2,tax2);
        bill1.printBill("002",25.75,overagePayment2,tax2,billTotal);

        /*****************
         * Phone Bill 3
         */

        //Create instance of Phone bill class
        PhoneBill bill3 = new PhoneBill();
        bill3.setId("003");
        bill3.setBaseCost(25.75);
        bill3.setAllocatedMinutes(500);
        bill3.setMinutesUsed(400);
        int overageMinutes3 = bill3.calculateOverage(500, 400);
        double overagePayment3 = bill3.calculateOverageFee(overageMinutes3, 25.75);
        double subTotal3 = bill3.calculateSubTotal(25.75, overagePayment3);
        double tax3 = bill3.calculateTaxPayment(subTotal3, 0.15);
        double billTotal3 = bill3.calculateTotalBill(subTotal3,tax3);
        bill3.printBill("003",25.75,overagePayment3,tax3,billTotal);


    }
}
