// Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.*;

public class checkNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num>=0){
            System.out.println("positive number");
        }else{
            System.out.println("negative number");
        }
    }
}
