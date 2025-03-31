//Nth Fibonacci Number

class GFG_nthNum {
    public int nthFibonacci(int n) {
        if(n<=1){
            return n;
        }
        int f1 = 0,f2 = 1,next=0;
        for(int i=2;i<=n;i++){
            next = f1+f2;
            f1=f2;
            f2=next;
        }
        return next;
    }
}
