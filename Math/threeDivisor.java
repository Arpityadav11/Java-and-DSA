class threeDivisor {
    public boolean isThree(int n) {
        int divisors= 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                divisors ++;
            }
        }
        if(divisors==3){
            return true;
        }
        return false;
    }
}
