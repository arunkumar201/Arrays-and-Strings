package com.company;

import java.util.Arrays;

public class InsertionInArray {

    static void InsertAtBigin(int a[],int pos,int k,int csize){
      int n=a.length;
      for(int i=csize;i>=pos;i--){
         a[i]=a[i-1];
      }
      a[pos]=k;
        System.out.println ( Arrays.toString (a));

    }
    public static void main ( String[] args ) {
        int []a=new int[8];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        int n=a.length;
        System.out.println (n);
        for ( int j : a ) {
            System.out.print ( j + " " );
        }
       int pos=2;
        int key=100;
        int curr_size=4;
        InsertAtBigin(a,pos,key,curr_size);

    }
}
