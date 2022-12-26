import java.io.*;
import java.util.*;
public class Anti_palindrome_strings {

    static String palindrome(String s){
        char[] str =s.toCharArray();
        int h=str.length-1;
        int l=0;
        while(l<=h){

            if(str[l]!=str[h]) {
                Arrays.sort(str);
                return String.valueOf(str);
            }
            l++;
            h--;
        }
       return "-1";
    }

    public static void main ( String[] args ) {

        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt ();
        int i=0;
        String []a=new String[t];
        while(t>0){
            a[i]=sc.next();
            String s=a[i];
            String s1=palindrome(s);
            System.out.println(s1);
            t--;
        }

    }
}
