class GFG_findTheFine {

    public long totalFine(int date, int car[], int fine[]) {
        int sum = 0;
        for(int i=0;i<car.length;i++){
            if(date%2==0){
                if(car[i]%2 != 0)
                sum += fine[i];
            }else{
                if(car[i]%2 ==0){
                    sum += fine[i];
                }
            }
        }
        return sum;
    }
}
