
import java.util.*;

public class primesInRange {

    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void primesInRange(int m){
        for(int i =2;i<=m;i++){
            if(isPrime(i)){//true
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n =sc.nextInt();
        boolean isPrime = true;
        primesInRange(n);
    }
}
