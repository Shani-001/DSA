import java.util.*;
public class StringBuffej{
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Shani");
        sb.insert(5,1);
        sb.append("Saini");
        sb.delete(6,11);
        sb.replace(0,6,"Saini");
        sb.reverse();
        System.out.println(sb);
    }
}