import java.util.*;
public class MaxMedian {


    public static void main ( String[] args ) {

        int []a={ 9, 8, 7, 6, 5, 4 };
        int n=a.length;

        Arrays.sort(a);

        if(n%2!=0){
            int temp=a[n/2];
            a[n/2]=a[n-1];
            a[n-1]=temp;
            System.out.println (Arrays.toString ( a ));
            System.out.println (a[n/2]);
        }
        else{
            int x=n/2;
            int temp1=a[x-1];
            a[x-1]=a[n-2];
            a[n-2]=temp1;
            int temp2=a[x];
            a[x]=a[n-1];
            a[n-1]=temp2;
            double mid=(double)(a[x-1]+a[x])/2;
            System.out.println (Arrays.toString ( a ));
            System.out.println (mid);
        }



    }
}
