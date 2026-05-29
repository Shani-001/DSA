public class NQueenPossible{

   public static boolean isSafe(char board[][],int row,int col){
     //up
      for (int i =row-1; i >=0; i--) {
          if(board[i][col]=='Q'){
            return false;
          }
      }
     //diag left
     for (int i = row-1,j=col-1; i>=0 && j>=0; i--,j--) {
         if(board[i][j]=='Q'){
            return false;
         }
     }
     //diag right
     for (int i = row-1,j=col+1; i>=0&&j<board.length; i--,j++) {
         if(board[i][j]=='Q'){
            return false;
         }
     }
     return true;
   }
    public static boolean NQueen(char board[][],int row){
       //base case
          if(row==board.length){
            // print(board);  //to print chessboard solution
            count++; //to count total solution
            return true;
          }       
          //recursion
          for (int j = 0; j < board.length; j++) {
             if(isSafe(board,row,j)==true){
                board[row][j]='Q'; 
                if(NQueen(board,row+1)){
                  return true;
                }
                //recursion condition
                board[row][j]='X';  //backtracking
             }
          }
          return false;
           }

    public static void print(char board[][]){
        System.out.println("----------------chessboard------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println("");
        }
    }
    static int count=0;
    public static void main(String[] args) {
        int n=2;
        char board[][]=new char[n][n];
        //initialization of chessboard
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j]='X';
            }
        }
        if(NQueen(board,0)){
       System.out.println("Solution exist");
       print(board);
        }else{
            System.out.println("Solution doesnt exist");
        }
        // System.out.println("Total solution are: "+count);
    }
}