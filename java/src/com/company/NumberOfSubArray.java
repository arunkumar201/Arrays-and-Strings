package com.company;

public class NumberOfSubArray {
    //    int []a=new int[5];
    public static void main ( String[] args ) {

        int[] a = {1, 2, 3,4};
int c=0;
        int n = a.length;
        for ( int i = 0 ; i < n ; i++ ) {

            for (int  j = i; j < n ; j++ ) {

                for ( int k = i ; k <= j ; k++ ) {
                    System.out.print ( a[k] + " " );

                }
                c++;
                System.out.println ();

            }


        }
        System.out.println (c);
    }
}
