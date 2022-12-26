import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Find_Triplet_Whose_Sum_k {
    //TC=O(N^3) and SC=O(1)
    public static  boolean getTriplet_BruteForce(int a[],int sum){
       int n=a.length;
       if(n<=2){
           return false;
       }
       int currSum=0;
       for(int i=0;i<n-2;i++){
           for(int j = i+1; j<n-1;j++){
               for (int k = j+1; k<n; k++) {
                  currSum=a[i]+a[j]+a[k];
                   if(currSum==sum){
                       System.out.println(Arrays.toString(new int[]{a[i],a[j],a[k]}));
                       return true;
                   }
               }
           }
       }
   return false;
    }


  //TC=O(N^2) and SC=O(N)
    public static  boolean getTriplet(int a[],int sum) {
        int n = a.length;
        if (n <= 2) {
            return false;
        }
        for(int i = 0; i < n; i++){
            int rem_sum=sum-a[i];
            HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
            for(int j = i+1; j < n; j++){

                if(hs.containsKey(rem_sum-a[j])){
                    System.out.println(Arrays.toString(new int[]{a[i],a[j],hs.get(rem_sum - a[j])}));
                    return true;
                }
                hs.put(a[j],a[j]);
            }
        }
        return false;
    }

    //TC=O(n^2) and SC=O(1)
    public static  boolean getTriplet_MoreOptimized(int a[],int sum) {
        int n = a.length;
        if (n <= 2) {
            return false;
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++){
            int low=i+1;
            int high=n-1;
            while(low<high){
                int s=a[i]+a[low]+a[high];
                if(s<sum){
                    low++;
                }else if(s>sum){
                    high--;
                }
                else if(s==sum) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int sum=9;
        boolean res=getTriplet_MoreOptimized(a,sum);
        System.out.println("Final result is " + res);
    }
}
