// income tax calculator 
import java.util.*;

public class calculateTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you annnual income: ");
        int income = sc.nextInt();
        int tax ;
        if (income<=500000){
            System.out.println("you dont have to pay any tax");
        }else if(500000<income && income<=1000000){
            tax = income * 20/100 ;
            System.out.println("tax to be paid: "+ tax);
        }else{
            tax = income * 30/100 ;
            System.out.println("tax to be paid: "+ tax);
        }
    }
}
