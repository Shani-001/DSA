
import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

public class ActivitySelect{
    public static void main(String args[]){
        int start []={12,20,10}; //12 20 10
        int end[]={25,30,20};    //25 30 20

        //not sorted then sort like this acc to end time
        int activities[][]=new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));

        int maxAct=0;
        ArrayList<Integer>ans=new ArrayList<>();
        //first activity selected
        maxAct=1;
        ans.add(activities[0][0]);

        int lastEnd=activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if(activities[i][1]>=lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        }

        System.out.println("maximum activities performed are:"+maxAct);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
        System.out.println("");
    }
}