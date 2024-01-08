package com.company;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main ( String[] args ) {
        int a[] = {9,8,7,6,5,4,3,2,1,0,-4};
        int n = a.length;

        //By using Extra temp Array
//        ReverseExtraArray ( a, n );
//        ReverseSwapping ( a, n );
        int high=a.length-1;
        int low=0;
       // ReverseUsingRecursion( a,low,high);

       // for(int j=0;j<n;j++){
       //     System.out.print(a[j]+" ");
      //  }
        Arrays.sort(a);
        for(int j=0;j<n;j++){
            System.out.print(a[j]+" ");
        }



    }
    static void ReverseExtraArray ( int a[], int n ) {
         if(n==0){
             return;
         }
         int []temp=new int[n];
          int j=n-1;
         for(int i=0;i<n;i++){
             temp[j]=a[i];
             j--;
         }
         //now displaying the reverse Array
        System.out.print("Reverse of an Original Array is:");
        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println ();
    }


    static void ReverseSwapping( int a[], int n ) {
        if(n==0){
            return;
        }
        int temp;
        for(int i=0;i*i<n;i++){
           temp=a[i];
           a[i]=a[n-i-1];
           a[n-i-1]=temp;
        }
        //now displaying the reverse Array
        System.out.print("Reverse of an Original Array is(Swapping):");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println ();
    }


    static void ReverseUsingRecursion(int []a,int low,int high){
        //Base Case
        if(low>=high){
            return;
        }

        //Recursive Case /condition
         Swap(a,low,high);
//        int temp=a[low];
//        a[low]=a[high];
//        a[high]=temp;
        ReverseUsingRecursion(a,low+1,high-1);



    }
    static  void Swap(int a[],int l,int h){
        int temp=a[l];
        a[l]=a[h];
        a[h]=temp;
    }
}
