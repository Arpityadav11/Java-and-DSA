// Write a Java method to compute the sum of the digits in an integer.
import java.util.*;

public class sumInNum{

    public static int sumInNum(int n){
        int sum = 0;
        while(n>0){
            int lastDig = n%10;
            sum+=lastDig;
            n=n/10;
        }
        return sum;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum = sumInNum(n);

        System.out.println("sum of digits of number is: "+sum);
        }
}
