public class SearchSortedMatrix{

    public static boolean searchSortedMatrix(int matrix[][],int key){
       //Staircase Search
       int row=0,col=matrix.length-1;
       while(row<=matrix.length-1 && col>=0){
        if(key==matrix[row][col]){
            System.out.print("Key found at"+"("+row+","+col+")");
            return true;
        }
        else if(key<matrix[row][col]){
            col--;
        }
        else{
            row++;
        }
       }
       System.out.println("Key not found");
       return false;
    }
    public static void main(String args[]){
        int matrix[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        searchSortedMatrix(matrix,37);
    }
}