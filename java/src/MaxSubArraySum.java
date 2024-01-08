public class MaxSubArraySum {
    static int MaxSubArraySumres ( int a[] ) {
        int n = a.length;
        if (n == 0) {
            return -1;
        }

        int maxSum1=0;
//        int maxSum2 =0;
        int res = 0;
        int max2=Integer.MAX_VALUE;
        for ( int i = 1; i <=n-1; i++ ) {

            if(maxSum1<0){
                maxSum1=a[i+1];
                max2=a[i];
            }
            else {
                maxSum1+=a[i-1];
                max2 =maxSum1 + a[i];
            }
            res = Math.max ( maxSum1, max2 );
        }

        System.out.println (maxSum1);

        return res;
    }



    public static void main ( String[] args ) {
        int []a={5,4,-1,7,8};
//        int []a={-2,1,-3,4,-1,2,1,-5,4};
        int n=MaxSubArraySumres(a);
        System.out.println ("Maximum Contiguous SubArray Sum:"+n);
    }
}
