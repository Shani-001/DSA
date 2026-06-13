
import java.util.Stack;

public class ReverseString{

    public static void ReverseString(Stack<Character>s,String str){
          for (int i = 0; i < str.length(); i++) {
              s.push((str.charAt(i)));
          }

          StringBuilder str1=new StringBuilder("");

          while(!s.isEmpty()){
          str1.append(s.pop());
          }
          System.out.println(str1);

    }
    public static void main(String[] args) {
        Stack<Character> s=new Stack<>();
        String str="Hello";
        ReverseString(s,str);
    }
}