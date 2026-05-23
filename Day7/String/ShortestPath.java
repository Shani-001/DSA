public class ShortestPath{
    public static void ShortestPath(String str){
        int x=0,y=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='N'){
             y+=1;
            }
            else if(str.charAt(i)=='S'){
            y-=1;
            }
            else if(str.charAt(i)=='W'){
                x-=1;
            }
            else{
                x+=1;
            }
        }
        // int x1=(int)Math.pow(x,2)+(int)Math.pow(y,2);
        int X2=x*x;
        int Y2=y*y;
        float distance=(float)Math.sqrt(X2+Y2);
        System.out.println("distance is "+distance);
    }
    public static void main(String[] args) {
        // String str="WNEENESENNN";
        String str="NSS";
        ShortestPath(str);
    }
}