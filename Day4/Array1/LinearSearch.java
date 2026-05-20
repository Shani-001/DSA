public class LinearSearch{

    public static int LinearSearch(int Number[],int key){
        for(int i=0;i<Number.length;i++){
            if(Number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int Numbers[]={10,20,30,40,50};
        int key=55;
        int Ans=LinearSearch(Numbers,key);
        System.out.println("Key is present on index number "+Ans);

    }
}