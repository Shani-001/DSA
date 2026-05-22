public class DiagonalSum{

    public static void printSumMatrixDiagonal(int matrix[][]){
        int sum=0;
       for(int i=0;i<matrix.length;i++){
        //Primary Diagonal
        sum+=matrix[i][i];  

        //Secondary Diagonal 
        if(i!=matrix.length-1-i){ //check condition if middle element is already counted in odd matrix size like 3x3
            sum+=matrix[i][matrix.length-1-i];
        }

       }
       System.out.println("sum is : "+sum);
    }
    public static void main(String args[]){
        int matrix[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        printSumMatrixDiagonal(matrix);
    }
}