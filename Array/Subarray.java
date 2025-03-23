import java.util.*;

public class Subarray {

    public static void subArray(int num[]){
        for(int i =0;i<num.length;i++){
            for(int j = i;j<num.length;j++){
                for(int k= i;k<j;k++ ){
                System.out.print(num[k]+" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = {2,4,6,8,10};
        subArray(num);
        }
}


// Scanner sc = new Scanner(System.in);
// System.out.println("enter the number");
// int n = sc.nextInt();
