
import java.util.HashMap;

public class ItineraryTicket{
    public static String getStart(HashMap<String,String>tickets){
         HashMap<String,String>revMap=new HashMap<>();
         for (String tick : tickets.keySet()) {
             revMap.put(tickets.get(tick),tick);
         }
         for (String tick : tickets.keySet()) {
             if(!revMap.containsKey(tick)){
                return tick;
             }
         }
         return "";
    }
    public static void main(String[] args) {
        HashMap<String,String> tickets=new HashMap<>();
        String arr[][]={
            {"Chennai","Bangaluru"},
            {"Mumbai","Delhi"},
            {"Goa","Chennai"},
            {"Delhi","Goa"},
        };
        for (int i = 0; i < arr.length; i++) {
            tickets.put(arr[i][0],arr[i][1]);
        }
       String start= getStart(tickets);
        System.out.print(start);
        for (String tick : tickets.keySet()) {
            System.out.print("->"+tickets.get(start));
            start=tickets.get(start);
        }
        
    }
}