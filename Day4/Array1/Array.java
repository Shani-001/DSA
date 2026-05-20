public class Array{
    public static void update(String Fruits[]) {
        for (int i = 0; i < Fruits.length; i++) {
            Fruits[i]=Fruits[i]+"s";
        }
    }
    public static void main(String args[]){
        String Fruits[]={"Orange","Mango","Apple"};
        update(Fruits);
        for(int i=0;i<Fruits.length;i++){
            System.out.println(Fruits[i]+" ");
        }
    }
}