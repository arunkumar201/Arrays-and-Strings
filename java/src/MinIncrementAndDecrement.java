import java.util.Arrays;
import java.lang.*;
public class MinIncrementAndDecrement {

    public static void main ( String[] args ) {
        int []a={1, 6, 7, 10};
        int n=a.length;
        Arrays.sort(a);
        int mid=a[n/2];
        int cost=0;
        for( int j : a ) {
            cost += Math.abs(mid-j);
        }

        if(n%2==0){
            int tempcost=0;
            int mid1=a[n/2-1];
            for ( int j : a ) {
                tempcost += Math.abs ( mid1 - j );
            }
                cost=Math.min (cost,tempcost);

        }

        System.out.println (cost);


    }
}
