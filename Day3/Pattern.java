public class Pattern{
    public static void main(String args[]){
     
     /*
      Pattern to print
      1.Outer loop => no of lines to print
      2.Inner loop=>How many times to run
      3.What to print=>"*"
      */



        // for(int line=1;line<=4;line++){
        //     for(int star=1;star<=5-line;star++){ //star<=n-i+1 =>i=>line n=>Total number of lines
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // for (int line = 1; line <=4; line++) {
        //     for (int j = 1; j <=line; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        

                char ch='A';
        for (int line = 1; line <=4; line++) {
            for (int j = 1; j <=line; j++){
                System.out.print(ch);
                ch=(char)(ch+1);
            }
            System.out.println();
        }
    }
}