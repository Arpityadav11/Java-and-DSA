// Writeaprogramthatreadsasetof integers,andthenprintsthesumofthe
//even and odd integers.


import java.util.*;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int evenSum = 0;
        int oddSum=0;

        for(int i=1;i<=n;i++){
            if(i%2==0){
                evenSum += i;
            }else{
                oddSum += i;
            }
        }

        System.out.println("sum of even numbers is: "+evenSum);
        System.out.println("sum of odd numbers is: "+oddSum);
    }
}
