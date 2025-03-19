
import java.util.*;

public class decToBin {

    public static void decToBin(int decNum){
        int myNum = decNum;
        int pow= 0;
        int rem = 0;
        int binNum = 00;

        while(decNum>0){
            rem = decNum%2;
            binNum = binNum+(rem*(int)Math.pow(10, pow));
            pow++;
            decNum = decNum/2;
        }
        System.out.println("the binary numer of "+ myNum+" is: "+ binNum);
    }
    public static void main(String[] args) {
        decToBin(2);
    }
}
