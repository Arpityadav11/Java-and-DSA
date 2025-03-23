// User function Template for Java
class Solution {
    public static int sumOfDivisors(int n) {
        int sum =0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i%j==0){
                    sum=sum+j;
                }
            }
        }
        return sum;
    }
}
