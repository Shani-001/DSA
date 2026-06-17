
import java.util.ArrayList;


//ANS 1 WITHOUT USING CLASS

// import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.Arrays;
// public class JobSequencing{
//     public static void main(String[] args) {
//         int jobs[][]={
//             {0,4,20},
//             {1,1,10},
//             {2,1,40},
//             {3,1,30}
//         };
//         ArrayList<Integer>ans=new ArrayList<>();
//         Arrays.sort(jobs,Comparator.comparingDouble(o->o[2]));
//         for (int i = 0; i < jobs.length; i++) {
//             for (int j = 0; j < jobs[0].length; j++) {
//                 System.out.print(jobs[i][j]+" ");
//             }
//             System.out.println("");
//         }
//          int time=0;
//          for (int i = jobs.length-1; i >=0; i--) {
//              if(jobs[i][1]>time){
//                ans.add((jobs[i][0]));
//                time++;
//              }
//          }
//          System.out.println("ans is: "+time);
//          for (int i = 0; i < ans.size(); i++) {
//              System.out.print((char)((ans.get(i))+97)+" ");
//          }
//     }
// }

//ANS2 USING CLASS
import java.util.*;

public class JobSequencing{

  static class Job{
        int deadline;
        int profit;
        int idx;
        Job(int i,int d,int p){
          idx=i;
          deadline=d;
          profit=p;
        }
    }
    public static void main(String[] args) {
         int jobsInfo[][]={
            {4,20},
            {1,10},
            {1,40},
            {1,30}
        };

        ArrayList<Job> jobs=new ArrayList<>();
        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        Collections.sort(jobs,(a,b)->b.profit-a.profit);

        ArrayList<Integer>ans=new ArrayList<>();
        int time=0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr=jobs.get(i);
            if(curr.deadline>time){
                ans.add(curr.idx);
                time++;
            }
        }

         System.out.println("ans is: "+time);
         for (int i = 0; i < ans.size(); i++) {
             System.out.print((char)((ans.get(i))+97)+" ");
         }
    }
}