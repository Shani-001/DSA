public class SudokuSolver{

  public static boolean isSafe(int sudoku[][],int row,int col,int digit){
    // digit exist in row
    for(int i=0;i<=8;i++){
        if(sudoku[row][i]==digit){
            return false;
        }
    }
    //digit exist in col
    for(int i=0;i<=8;i++){
        if(sudoku[i][col]==digit){
            return false;
        }
    }
    //number exist in 3x3 grid
    int sr=(row/3)*3;
    int sc=(col/3)*3;
    for (int i = sr; i <sr+3; i++) {
        for (int j = sc; j < sc+3; j++) {
            if(sudoku[i][j]==digit){
                return false;
            }
        }
    }
    return true;
  }

    public static boolean sudokuSolver(int sudoku[][],int row,int col){
        //base condition
        if(row==9){
            return true;
        }
        //recursion
        int nextRow=row,nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        //number is not 0 means already exist another number in sudoku so dont change that number go for next level
        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        //place digit
       for(int digit=1;digit<=9;digit++){
        if(isSafe(sudoku,row,col,digit)){ //check if we can place or not 
            sudoku[row][col]=digit;
            if(sudokuSolver(sudoku,nextRow,nextCol)){ //check for next level is sol exist after placing 
                return true;
            }
            sudoku[row][col]=0; //if not exist solution for nextlevel then make it 0 again
        }
       }
       return false;
    }

    public static void print(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][]={
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
        };

        boolean ans=sudokuSolver(sudoku,0,0);
        if(ans){
            System.out.println("Solution exist:");
            print(sudoku);
        }
        else{
            System.out.println("Solution doesnt exist");
        }
    }
}