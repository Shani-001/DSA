public class Intern{
    public static void main(String[] args){
        String str=new String("Shani");
        String str2=new String(str.intern());
        String str3="Shani";
        String str4=str3;
        // System.out.print(str.intern());
        // System.out.println(str==str2);
        // System.out.println(str.equals(str2));
        // System.out.println(str.intern()==str2.intern());
        // System.out.println(type(str));
        System.out.println(str3==str4);
    }
}