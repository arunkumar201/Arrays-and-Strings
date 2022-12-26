package com.company;

public class RemoveDuplicateFromArray {

    static int RemoveDuplicate(int a[] ,int n){
        if(n==0 || n==1){
            return n;
        }
        int temp[] = new int [n];
        int j=0;
        for ( int i=0;i<n-1;i++ ){

            if(a[i]!=a[i+1]){
                temp[j]=a[i];
                j++;
            }
        }
        temp[j++]=a[n-1];

        for(int i=0;i<j;i++){
            a[i]=temp[i];
        }
        return j;
    }


    public static void main(String[] args){
        int a[]={1,1,1,3,3,4,4,5,44,44,121,121};
        int j=RemoveDuplicate(a,a.length);

        for(int i=0;i<j;i++){
            System.out.print(a[i]+" ");
        }

    }
}
