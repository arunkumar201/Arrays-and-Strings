package com.company;
/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.




 */
public class Longest_Common_Prefix_14 {
    public static String longestCommonPrefix(String[] str) {
        int n=str.length;
        if(n==0)
            return "";
        String ns="";
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(str[i].charAt(j)==str[i+1].charAt(j)){
                    ns+=str[i].charAt(j);
                }
                else{
                    break;
                }
            }
        }

     return ns;
    }

    public static void main(String[] args) {
//        String str[]=new String[]{"flower","flow","flight"};
        String str[]={"dog","racecar","car"};
        String s=longestCommonPrefix(str);
        System.out.println("Final Answer: " + s);

    }

}
