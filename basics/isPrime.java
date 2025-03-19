
import java.util.*;

public class isPrime {

    public static boolean isPrime(int n , boolean isPrime){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n =sc.nextInt();
        boolean isPrime = true;
        if(n<=1){
            isPrime =false; 
            System.out.println("the number is prime number ?? "+"\n"+isPrime(n, isPrime));
        }else if(n==2){
            System.out.println("the number is prime number ?? "+"\n"+isPrime(n, isPrime));
        } else{
            System.out.println("the number is prime number ?? "+"\n"+isPrime(n, isPrime));
        }
    }
}
