public class Function{

    // public static void printHelloWorld(){  //Made Function
    //     System.out.println("Hello World");
    // }

    // public static int calculateSum(int a,int b){
    //  int sum=a+b;
    //  return sum;
    // }

    // public static void Swap(int a,int b){
    //     int c=0;
    //     c=a;
    //     a=b;
    //     b=c;
    //     System.out.println(a+" "+b);
    //     return;
    // }

    // public static int Product(int a,int b){
    //     int product =a*b;
    //     return product;
    // }

    public static int Factorial(int a){
        if(a==0){
            return 1;
        }
        else{
            int fact=1;
            for(int i=1;i<=a;i++){
             fact=i*fact;
            }
        return fact;
        } 
    }

    public static float Binomial(int n,int r){
     int nfact=Factorial(n);
     int rfact=Factorial(r);
     int nmrfact=Factorial(n-r);
     System.out.println(nfact+" "+rfact+" "+nmrfact);
     float BC=(nfact)/(rfact*nmrfact);
     return BC;
    }

    public static void main(String args[]){  //Always main implement first
    //    printHelloWorld();  //call Function
    //   Scanner sc=new Scanner(System.in);
    //  int a=sc.nextInt();
    //  int b=sc.nextInt();
    //   int sum=calculateSum(a, b);  
    //   System.out.print(sum);
      
      // Formal Parameter=>Parameters=>Passed in Definition of Function
      // Actual Parameter=> Arguments =>Passed in Call of Function

      //Pass by Value
      int a=10,b=2;
    //   Swap(a, b);
    //   System.out.println(a+" "+b);
    //    int Product= Product(a,b);
    //    System.out.print(Product);
     int Factorial=Factorial(a);
    //  System.out.println(Factorial);
    float BD=Binomial(a, b);
    // System.out.println(BD);

    

    }
}