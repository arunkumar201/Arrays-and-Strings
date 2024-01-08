public class SecondLargestElement {
  static int SecondLargest(int a[],int n){
      if(n==0){
          return -1;
      }
      int c=0;
      int BaseCase=a[0];
      for ( int i=0;i<n;i++ ) {
          if (a[i] == BaseCase) {
              c++;
          }
      }
      int FirstMax=a[0];
      for(int i=0;i<n-1;i++){
          if(FirstMax<a[i]){
              FirstMax=a[i];
          }

      }
      if(c==n){
          return -1;
      }
//      int secondMax=0;
      //Calculate the second Largest
      int secondMax=a[0];
      for(int i=0;i<n-1;i++){
          if(a[i]!=FirstMax){
              if(a[i]>secondMax){
                  secondMax=a[i];
              }
          }
      }
      return secondMax;

  }


static int SecondLargest_OptimalSol(int a[],int n){
   int first=a[0];
   int prev=0;

   for(int i=0;i<n;i++){

       if(first<a[i]){
           prev=first;
           first=a[i];
       }

   }
    return prev;
}





    public static void main ( String[] args ) {
        int []a={42 ,28 ,43 ,26 ,65, 60, 54, 51, 35 ,42, 48 ,33 ,40, 58 ,38, 64, 47 ,44 ,49 ,46 ,25 ,57, 39 ,55 ,45 ,29 ,32, 61, 53, 31 ,36 ,56, 63 ,30, 52, 27, 34 ,50, 41, 37 ,66, 62, 59};
        int n=a.length;
//        int res=SecondLargest(a,n);
        int res1=SecondLargest_OptimalSol(a,n);
        System.out.println (res1);

    }


}

