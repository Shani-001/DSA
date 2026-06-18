
import java.util.Scanner;

public class InputInteger{
    public static void main(String[] args) {
        Character arr[]=new Character[4];
        Scanner sc=new Scanner(System.in);
      for (int i = 0; i < arr.length; i++) {
          arr[i] = sc.next().charAt(0);
      }
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }

    }
}