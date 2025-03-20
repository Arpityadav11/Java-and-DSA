// find the largest number in an array
import java.util.*;

public class getLargest {
     
    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i= 0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {2,7,5,4,6,9,8,22,2};

        int largest = getLargest(arr);
        System.out.println("largest in the array is: "+largest);
        }
}
