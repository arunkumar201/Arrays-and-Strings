import java.util.*;
public class MedianArray {
    public static void main ( String[] args ) {

//        int[] a = {1, 3, 4, 2, 6, 5, 8,7};
        int []a = {4, 4, 4, 4, 4};
        int n = a.length;
        System.out.println (n);
        Arrays.sort ( a );
        System.out.println (Arrays.toString ( a ));
        if(n%2==1){
            System.out.println (a[n/2]);
        }
        else {
            int x=(n/2);
            double n1=(a[x-1])+(a[x]);
            System.out.println (n1/2);
        }
    }
}
