public class Largest{

   //Find Largest Number
    public static int Largest_Number(int Numbers[]){

        //Important point
        int Largest=Integer.MIN_VALUE; //-infinity =>Lowest Value in integer which is negative value
        int Smallest=Integer.MAX_VALUE; //+infinity =>Biggest value in integers 
        for (int i = 0; i < Numbers.length; i++) {
            if(Largest<Numbers[i]){
                Largest=Numbers[i];
            }
            if(Smallest>Numbers[i]){
              Smallest=Numbers[i];
            }

        }
        System.out.println("Smallest Value "+Smallest);
        return Largest;
    }
    public static void main(String args[]){
        int Numbers[]={10,20,30,40,99,40,30};
        int Largest=Largest_Number(Numbers);

       System.out.println("Largest Number "+Largest);
        
    }
}