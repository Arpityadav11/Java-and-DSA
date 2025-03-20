import java.util.*;

public class binarySearch {
     
    public static int binarySearch(int num[],int key){
        int start =0 , end= num.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            // comparisons

            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<=key){//right
                start= mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("enter the key: ");
        int key = sc.nextInt();

        int binarySearch = binarySearch(arr, key);

        System.out.println("index for the is: "+binarySearch);
        }
}


// Scanner sc = new Scanner(System.in);
// System.out.println("enter the number");
// int n = sc.nextInt();
