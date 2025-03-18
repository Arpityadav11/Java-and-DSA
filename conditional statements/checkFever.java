/*  FinishthefollowingcodesothatitprintsYouhaveafeverifyourtemperature
//is above 100 and otherwise prints You don't have a fever  */
import java.util.*;

public class checkFever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the temperature");
        int temp = sc.nextInt();

        if(temp>=100){
            System.out.println("you have fever");
        }else{
            System.out.println("you don't have fever");
        }
    }
}
