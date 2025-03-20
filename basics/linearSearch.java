
import java.util.*;

public class linearSearch {

    public static int linerSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(key == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int arr[] = {2,4,6,8,10,12,14};

        int search = linerSearch(arr, key);
        System.out.println(search);
        }
}
