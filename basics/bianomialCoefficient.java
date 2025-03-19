
import java.util.*;

public class bianomialCoefficient {

    public static int factorial(int a){
        int fact = 1;
         for(int i=a;i>=1;i--){
            fact = fact*i;
         }

         return fact;
    }

    public static int binomialCoff(int n,int r,int factor){
        int coff = (factorial(n))/(factorial(r)*factorial(factor));
        return coff ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n and r respectively");
        int n =sc.nextInt();
        int r = sc.nextInt();
        int factor = (n-r);
        int coefficient = binomialCoff(n, r, factor);
        System.out.println(coefficient);

    }
}
