// Enter cost of 3 items from the user (using float data type)- a pencil, a pen and an eraser. 
// You have to output the total cost of the items back to the user as their bill.
//(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.*;

public class printBillAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the price of pencil, pen and an eraser respectively");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen +eraser;
        float tax = total * 18/100;
        float bill = total  + tax;

        System.out.println("total bill including GST is: "+ bill);
    }
}
