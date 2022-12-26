package com.company;

public class ReverseString {

    public static void main ( String[] args ) {
        String str="racecar";
        String s=reverseWord(str);
        System.out.println (s);
    }
    public static String reverseWord(String str)
    {
        int high=str.length()-1;
        int low=0;
        String str1="";
        char ch;
        while(low<str.length ()){
            ch=str.charAt(high-low);
            str1=ch+str1;
            low++;
        }
//        for (int i=0;i<str.length ();i++ ){
//            ch=str.charAt(high-i);
//            str1=str1+ch;
//        }
        System.out.println (str1);
        return str1;

    }
}
