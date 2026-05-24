import java.util.*;
public class Anagram{
    public static void main(String[] args) {
        String arg1="care";
        String arg2="race";

        arg1=arg1.toLowerCase();
        arg2=arg2.toLowerCase();
        if(arg1.length()==arg2.length()){
        char arr1[]=arg1.toCharArray();
        char arr2[]=arg2.toCharArray();
        // System.out.println(Arrays.toString(arr1)+" "+Arrays.toString(arr2));
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // System.out.println(Arrays.toString(arr1)+" "+Arrays.toString(arr2));
        boolean result=Arrays.equals(arr1,arr2);
        if(result){
            System.out.println("Strings are Anagram");
        }
        else{
            System.out.println("Strings are not anagram");
        }
        }
        else{
            System.out.println("Strings are not anagram");

        }

       
       
    }
}