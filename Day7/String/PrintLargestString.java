public class PrintLargestString{
    public static void main(String[] args) {
      //Print largest in a Lexicographic way mean a>b>c

        String fruits[]={"apple","banana","mango"};
            String largest=fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if(largest.compareTo(fruits[i])<0){ 
                //if a.compareTo(b)=> ans<0=>b is greater or ans==0=>a is equal to b or ans>0=>a is greater
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}