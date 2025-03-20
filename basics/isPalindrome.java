
import java.util.*;

public class isPalindrome {

    public static int reverseNum(int n){
        int reverse = 0;
        while (n!=0) {
            int lastDigit = n%10;
            reverse= (reverse*10) + lastDigit;
            n = n/10;
        }
        return reverse;
    }

    public static boolean isPalindrome(int n){
        boolean isPalindrome = true;
        int reverse = reverseNum(n);
        if (reverse !=n) {
            isPalindrome = false;
        }
        return isPalindrome ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        boolean isPalindrome = isPalindrome(n);

        System.out.println("the number a is palindrome "+isPalindrome);
        }
}
