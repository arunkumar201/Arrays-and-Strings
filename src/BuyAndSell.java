public class BuyAndSell {

    static int maxProfit(int[] a) {
        int n=a.length;
//        int res=-9999;
        int max=0;
        if(n==1){
            return 0;
        }
        for(int i=0;i<n;i++){
            int d=a[i];
            for(int j=i+1;j<n-1;j++){
                d=a[j]-a[i];
                if(d>=max ){
                     max=d;

                }
            }
        }
    return max;
    }

    public static void main ( String[] args ) {
//        int price[]={7,1,5,3,6,4};
//        int price[]={7,6,4,3,1};
        int price[] = {1,2};
       int n= maxProfit(price);
        System.out.println ("Maximum Profit is:"+n);
    }
}
