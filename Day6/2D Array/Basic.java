import java.util.*;
public class Basic{

    public static boolean search(int matrix[][],int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==key){
                    System.out.println("number found");
                    return true;
                }
            }
        }
        System.out.println("number not found");
        return false;
    }
    public static int FindSmallest(int matrix[][]){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                }
            }
        }
        System.out.println("Smallest value is: "+min);
        return min;
    }
    public static int FindLargest(int matrix[][]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(max<matrix[i][j]){
                    max=matrix[i][j];
                    
                }
            }
        }
        System.out.println("Largest number is: "+max);
        return max;
    }
    public static void main(String args[]){

        int matrix[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int n=matrix.length, m=matrix[0].length;  //row=matrix length column=1st row length
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,15);
        FindSmallest(matrix);
        FindLargest(matrix);
    }
}  