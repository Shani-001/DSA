
import java.util.Arrays;
import java.util.Collections;

public class Chocola {

    public static void main(String args[]) {
        int n=4,m=6;
        Integer costVer[] = {2, 1, 3, 1, 4};  //m-1
        Integer costHor[] = {4, 1, 2};  //n-1

        //sort in desc order
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0;  //no of cuts
        int hp = 1, vp = 1; //no of pieces
        int cost = 0;     //cost
        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] <= costHor[h]) {  //horizontal cuts
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else {
                cost += (costVer[v] * hp);  //vertical cuts
                vp++;
                v++;
            }
        }

        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }

        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println(cost);
    }
}
