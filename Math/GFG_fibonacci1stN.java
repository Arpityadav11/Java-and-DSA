class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        int arr[] = new int[n];
        int f1 = 0,f2 = 1,next=0;
        for(int i=0;i<n;i++){
            if(i<=1){
            arr[i]=i;
        }else{
            next = f1+f2;
            arr[i]=next;
            f1=f2;
            f2=next;
        }
        }
        return arr;
    }
}
