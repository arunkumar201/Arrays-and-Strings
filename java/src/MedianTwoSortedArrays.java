import java.util.Arrays;


public class MedianTwoSortedArrays {

    static double Median(int a[]){

        int n=a.length;
        if(n%2!=0) {
            return a[n/2];
        }
        else{
            double mid=a[n/2]+a[n/2-1];
            double res=mid/2;
            return res;
        }
    }
 static void MergeSort(int []a,int []b){
     int m=a.length;
     int n=b.length;
     int []c=new int[m+n];

     int i=0,k=0;
     int j=0;
     while(i<m && j<n) {
         if (a[i] > b[j]) {
             c[k] = b[j];
             k++;
             j++;
         } else {
             c[k]=a[i];
             i++;
             k++;
         }
     }
     while(i<m){
         c[k++]=a[i++];
     }
     while(j<n){
         c[k++]=b[j++];
     }
    double mid=Median(c);
     System.out.println ("Median is:"+mid);
//     System.out.println (c[m+n-1]);
//     System.out.println (Arrays.toString ( c ));
 }

    public static void main ( String[] args ) {
//      int  []a= {-5, 3, 6, 12, 15};
//       int []b = {-12, -10, -6, -3, 4, 10};
       int a[] = {900};
        int b[] = {10, 13, 14};
        // 1, 2, 3, 4,5,7,8,23
        Arrays.sort (a);
        Arrays.sort ( b );
        MergeSort(a,b);
    }

}
