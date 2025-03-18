// Write a program to find the factorialof any number entered by the user.


import java.util.*;

public class findFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int fact = 1;

        while(n>1){
            fact = fact*n;
            n--;
        }

        System.out.println("factorial of the number is: "+fact);
    }
}
