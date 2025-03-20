import java.util.*;

public class arrayPairs {

    public static void arrayPairs(int num[]){
        for(int i =0;i<num.length;i++){
            int current = num[i];
            for(int j = i+1;j<num.length;j++){
                System.out.print("("+current+","+num[j]+")"+"  ");
            }
            System.out.println();
        }
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = {2,4,6,8,10};
        arrayPairs(num);
        }
}


// Scanner sc = new Scanner(System.in);
// System.out.println("enter the number");
// int n = sc.nextInt();
