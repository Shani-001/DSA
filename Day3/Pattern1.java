public class Pattern1{
    public static void PrintHollowRec(int row,int col){
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=col; j++) {
                if((i==1)||(j==1)||(i==row)||(j==col)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.err.println();
        }
    }

    // public static void Inverted_Rotated_Half_Piramid(int row,int cols){
    //   for (int i = 1; i <= row; i++) {
    //     //spaces
    //   for (int j = 1; j <=row-i; j++) {
    //    System.out.print(" ");   
    //   }
    //   //stars
    //   for (int j = 1; j <=i; j++) {
    //    System.out.print("*");   
    //   }
    //   System.out.println();
          
    //   }
    // }

    // public static void Inverted_Half_Piramid(int row,int col){
    //     for (int i = 1; i <=row; i++) {
    //         for (int j = 1; j <=row-i+1; j++) {
    //             System.out.print(j);
    //         }
    //         for (int j = 1; j <=row; j++) {
    //             System.out.print(" ");
    //         }
    //         System.out.println();
            
    //     }
    // }

    // public static void Floyd_Triangle(int row,int cols){
    //     int k=1;
    //      for (int i = 1; i <=row; i++) {
    //         for (int j = 1; j <=i; j++) {
    //             System.out.print(k+" ");
    //             k++;
    //         }
    //         for (int j = 1; j <=row; j++) {
    //             System.out.print(" ");
    //         }
    //         System.out.println();
            
    //     }
    // }

    // public static void Tiangle(int row,int cols){
    //    for (int i = 1; i <=row; i++) {
    //         for (int j = 1; j <=i; j++) {
    //            if((j+i)%2==0){
    //             System.out.print("1");
    //            } 
    //            else{
    //             System.out.print("0");
    //            }
    //         }
    //         System.out.println();
            
    //     }
    // }


    //Butterfly Pattern
    public static void Butterfly(int row){
        for (int i = 1; i <=row/2; i++) {
            //stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <=row-(2*i); j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = row/2; i >=1; i--) {
            //stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <=row-(2*i); j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //solid Rhombus
    public static void Solid_Rhombus(int row){
        for (int i = 1; i <=row; i++) {
            //spaces
            for (int j = 1; j <=row-i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <=row; j++) {
                
                System.out.print("*");
                
            }
            System.out.println();            
        }
    }

    public static void Hollow_Rhombus(int row){
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=row-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=row; j++) {
                if(i==1 ||j==1||i==row ||j==row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }
 
 //Diamond Pattern
    public static void Diamond(int row){
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=row-i; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
               System.out.print("*");
            }
            System.out.println();
            
        }
             for (int i = row; i>=1; i--) {
            for (int j = 1; j <=row-i; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
               System.out.print("*");
            }
            System.out.println();
            
        }
    }
        public static void main(String args[]){
        // PrintHollowRec(4,5);
        // Inverted_Rotated_Half_Piramid(4, 4);
        // Inverted_Half_Piramid(5, 5);
        // Floyd_Triangle(5, 5);
        // Tiangle(5, 5);
        // Butterfly(10);
        // Solid_Rhombus(5);
        // Hollow_Rhombus(5);
        Diamond(10);
    }
}