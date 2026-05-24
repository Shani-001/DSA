public class Swap2Numbers{
    public static void main(String[] args) {
        int a=10,b=20;
    //swap without using 3rd variable
        a=a^b;
        b=a^b;
        a=a^b;
        // System.out.println("a is:"+a+" "+"b is:"+b);


      //add integer+1 using bit manipulation
        int x=10;
        //-x=~x+1
        //- ~x=x+1
        // System.out.println("x+1 is:"+-~x);
       
       String character="";
       for(char ch='A';ch<='Z';ch++){
        character+=(char)(ch|' ');
       }
       System.out.println(character);

    }
}