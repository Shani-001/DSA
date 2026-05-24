public class CountVowel{
    public static void CountVowel(String str){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if('a'==str.charAt(i)||'e'==str.charAt(i)||'i'==str.charAt(i)||'o'==str.charAt(i)||'u'==str.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        // String str="ShradhaDidi";
        // String str1="ApnaCollege".replace("l","");
        // String str2="ShradhaDidi";
        // Scanner sc=new Scanner(System.in);
        // str=sc.next();
        // CountVowel(str);
        // System.out.println(str.equals(str1)+" "+str.equals(str2));
        // System.out.println(str1);

        String arg1="care";
        String arg2="races";
        int count=0;
        if(arg1.length()==arg2.length()){
        for(int i=0;i<arg1.length();i++){
            char ch=arg1.charAt(i);
            for(int j=0;j<arg1.length();j++){
                if(arg2.charAt(j)==ch){
                    count++;
                    // break;
                }
            }
        }}
        else{
            System.out.println("this strings are not angram");
        }
            if(count==arg1.length()){
                System.out.println("THIS STRINGS ARE ANAGRAM: "+count);
            }
            else{
                System.out.println("Strings are not Anagram: "+count);
            }
    }
}