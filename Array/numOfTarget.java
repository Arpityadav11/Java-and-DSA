// Number of target in 2-D array
public class JavaBasics {

    public static int  numOfTarget(int matrix[][],int target){
        int num = 0;
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (matrix[i][j] == target){
                    num += 1;
                }
            }
        }
        
        return num;
    }
}
