public class StringCompress{
    public static void StringCompress(String str){
        StringBuilder str2=new StringBuilder("");
        
        for (int i = 0; i < str.length(); i++) {
            str2.append(str.charAt(i));
           int count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ){ 
                //write the i condition first because java chack first condition from left to right
                count++;                
                i++;            
            }
            // str2.append(str.charAt(i));
            if(count>1){
                str2.append(count);
            }
            
        }
        System.out.println(str2);
    }
    public static void main(String[] args) {
        String str="aaaabbbbcccddd";
        StringCompress(str);
    }
}