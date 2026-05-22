public class sumSecondRow{
    public static void sumSecondRow(int matrix[][]){
        int sum=0,row=1;
        for(int i=0;i<matrix[0].length;i++){
            sum+=matrix[row][i];
        }
       System.out.println("Sum is:"+sum);
    }
    public static void main(String[] args) {
        int matrix[][]={
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };
        sumSecondRow(matrix);
    }
}