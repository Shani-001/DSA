public class LengthString{
    public static void LengthStringCal(String str,String newStr,int i,int length){
     if(newStr.equals(str)){
        System.out.print(length);
     }
     else{
     newStr+=str.charAt(i);
     length++;
     LengthStringCal(str, newStr, i+1, length);
     }
    }
    public static void main(String[] args) {
        String str="shanikumar";
        LengthStringCal(str,"",0,0);
    }
}