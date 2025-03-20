import java.util.*;

public class JavaBasics {
     
    public static void reverseAnArray(int num[]){
        int first = 0, last = num.length- 1;

        while (first<last) {
            
            int temp = num[last];
            num[last]= num[first];
            num[first]=temp;

            first ++;
            last --;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("original array : ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();

        reverseAnArray(num);

        System.out.println("Reversed array is: ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        }
}


// Scanner sc = new Scanner(System.in);
// System.out.println("enter the number");
// int n = sc.nextInt();
