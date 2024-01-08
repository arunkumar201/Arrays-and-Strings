import java.util.Scanner;

public class Equal_Operation {

    static int Getgcd(int a,int b){
        if(a==0) return b;
        return Getgcd(b%a,a);
    }
    public static void main ( String[] args ) {

      Scanner sc=new Scanner ( System.in );
        int t;
        t=sc.nextInt ();

        int n;
        while(t>0){
              n=sc.nextInt();
              int min=0;
             int []a=new int[n];
             for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(i==0) {
                    min = a[0];
                }
                else{
                    min=Getgcd(min,a[i]);
                }
           }
             long s=0;
             for ( int i=0;i<n;i++ ){
                 s += ((a[i] - min)/min);
             }
            System.out.println (s);
             t--;

        }
    }
}
