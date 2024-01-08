package com.company;
import  java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateM2 {

    static int RemoveDuplicate ( int a[], int n ) {
        Arrays.sort ( a );
        if (n == 0 || n == 1) {
            return n;
        }
        // int temp[] = new int [n];
        int j = 0;
        for ( int i = 0 ; i < n - 1 ; i++ ) {

            if (a[i] != a[i + 1]) {
                a[j] = a[i];
                j++;
            }
        }
        a[j++] = a[n - 1];

        return j;
    }

    static int RemoveDuplicateUsingSet ( int a[], int n ) {


        Set<Integer> s = new HashSet<Integer> ();

        for ( int i = 0 ; i < n ; i++ ) {
            s.add ( a[i] );
        }
        int i = 0;
        for ( Integer ele : s ) {
            a[i] = ele;
            i++;
        }


        return s.size ();

    }

    static int RemoveDuplicateUsing3Loops ( int a[], int n ) {
        int i = 0, j = 0;
        while (i < n) {
            j = i + 1;
            while (j < n) {
                if (a[i] == a[j]) {
                    for ( int k = j ; k < n - 2 ; k++ )
                        a[k] = a[k + 1];

                    n = n - 1;
                } else {
                    j++;
                }
            }
            i = i + 1;
        }
        return n;
    }

    static int RemoveDuplicateUsing2Loops ( int a[], int n ) {
  int j=0;
              int ans[]=new int[n];
              boolean mark[] =new boolean[n] ;
              for(int i=0;i<n;i++){
                  mark[i]=true;
              }
              for(int i=0;i<n;i++) {

                  if (mark[i] == true) {
                      for ( j = i + 1 ; j < n-1 ; j++ ) {
                          if (a[i] == a[j]) {
                              mark[j] = false;
                          }
                      }
                  }
              }
              int x=0;
              for ( int s=0;s<n;s++ ){

                  if(mark[s]==true){
                      System.out.print(a[s]+" ");
                      a[x]=a[s];
                      x++;
                  }
              }
              return x;
    }


    public static void main ( String[] args ) {
        int a[] = {1, 7, 121, 1, 3, 3, 4, 4, 5, 44, 44, 121, 121, 7};
//        int j=RemoveDuplicate(a,a.length);
//
//        for(int i=0;i<j;i++) {
//            System.out.print ( a[i] + " " );
//        }
//
//        System.out.println ();
//            int jset=RemoveDuplicateUsingSet(a,a.length);
//
//            for(int i=0;i<jset;i++){
//                System.out.print(a[i]+" ");
//        }


//        System.out.println ();
//        int jloop= RemoveDuplicateUsing3Loops(a,a.length);
//        for(int i=0;i<jloop;i++){
//            System.out.print(a[i]+" ");
//        }

        System.out.println ();
        int jloop2 = RemoveDuplicateUsing2Loops ( a, a.length );
        System.out.println ();
        for ( int i = 0 ; i < jloop2 ; i++ ) {
            System.out.print ( a[i] + " " );

        }
    }
}
