// check if a year is a leap year or not
import java.util.*;

public class checkLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the year");
        int year = sc.nextInt();

        String a = year%4==0? " It is a leap year ": "It is not a leap year" ;

        System.out.println(a);
    }
}
