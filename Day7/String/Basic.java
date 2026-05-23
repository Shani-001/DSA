import java.util.*;
public class Basic{
    public static void StringPrint(String name){

         
        for(int i=name.length()-1;i>=0;i--){
        System.out.println(name.charAt(i)+" ");
        }
       
    }
    public static void main(String[] args) {
        String str="Hello Shani";
        // System.out.println(str);
       Scanner sc=new Scanner(System.in);
        String name;
        name=sc.nextLine();
        StringPrint(name);
        // System.out.println(name);
    }
}