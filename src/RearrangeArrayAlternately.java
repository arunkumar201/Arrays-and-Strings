import java.util.Arrays;

public class RearrangeArrayAlternately {
//https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1
public static void rearrange(long a[], int n){
    if(n==0) return;
    if(n==1) return;
    long []temp=new long[n+1];
    int j=0;
    int i=0;
    int x=0;
    if(n%2==0)  {
        x=n/2-1;
    }
    else {
        x=n/2;
    }
    System.out.println(x);
    while(i<=x) {
        if(a[n-1-i]==a[i]){
            temp[j]=a[n-i-1] ;
            System.out.println(temp[j]);
        }
        else{
            temp[j++] = a[n - 1 - i];
            temp[j++] = a[i];
        }

        i++;
    }



//        System.out.println(Arrays.toString(temp));
    for (int k = 0; k< n; k++) {
        a[k] = temp[k];
    }
}

    public static void main(String[] args) {
//        long a[]={1,2,3,4,5,6};
        long a[]={350 ,863, 1902, 2328, 2854 ,3915 ,6800 ,8955 ,9877};
        rearrange(a,a.length);
        System.out.println("Final Result: " + Arrays.toString(a));
    }


}
