import java.util.*;
public class RainwaterTrapped{

    public static void TrappedWater(int height[]){
        //calculate left max boundary using Auxilary Array
        int leftMax[]=new int[height.length];
        int rightMax[]=new int[height.length];
        int max=0;

        for (int i = 0; i < height.length; i++) {
            if(i==0){
            leftMax[0]=height[0];
            }
            else{
             leftMax[i]=Math.max(leftMax[i-1],height[i]);
            }
        }

        //calculate Right max Boundry using Auxilary Array
        for (int i = height.length-1; i >=0; i--) {
            if(i==height.length-1){
            rightMax[i]=height[i];
            }
            else{
             rightMax[i]=Math.max(rightMax[i+1],height[i]);
            }
        }
        //Calculate Max Trapped Water =>for that find Watrlevel and subtract with Height and Multiply by width
        for (int i = 0; i < height.length; i++) {
            int waterLevel=0;
            int width=1;
            waterLevel=Math.min(leftMax[i],rightMax[i])-height[i];
            // if(waterLevel<0){
            //     waterLevel=0;
            // }
            max+=waterLevel*width;
        }
        System.out.println(max);
        
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        TrappedWater(height);
    }
}