
import java.util.ArrayList;

public class ContainerWater{
 
    //Brute force Approach
    public static void MaxWaterArea(ArrayList<Integer> list){
      int max=0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j <list.size(); j++) {
                int height=Math.min(list.get(i),list.get(j));
                int width=j-i;
                int waterArea=height*width;
                if(max<waterArea){
                    max=waterArea;
                }
            }
        }
        System.out.println(max+" ");
    }

    //2-Pointer Approach
    public static void MaxWaterArea2(ArrayList<Integer> list){
        int max=0;
        int Lp=0;
        int Rp=list.size()-1;
        while(Lp<Rp){
            //calculate water area
            int height=Math.min(list.get(Lp),list.get(Rp));
            int width=Rp-Lp;
            int currentArea=height*width;
            max=Math.max(currentArea,max);
            //update pointer
            if(list.get(Lp)<list.get(Rp)){
                Lp++;
            }
            else{
                Rp--;
            }
        }
        System.out.print("max is: "+max);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        
        MaxWaterArea2(list);
         

    }
}