import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Anagram_Palindrome {
    //https://bit.ly/3EBXFWy
    static int isPossible_BruteForce (String s)
    {
        int n=s.length();
        if(n==1){
            return 1;
        }
        HashMap<Character,Integer> mp=new HashMap<>();
         for (int i = 0; i < n; i++) {
             if(mp.containsKey(s.charAt(i))){
                 mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
             }
             else{
                 mp.put(s.charAt(i),1);
             }
         }
        HashSet<Character> hs=new HashSet<Character>();
         int c=0;
         int c1=0;
         for (int i = 0; i < n; i++) {
                if(!hs.contains(s.charAt(i))) {
                    if (mp.get(s.charAt(i))%2!= 0)
                        c++;
                }
                hs.add(s.charAt(i));
           }
        if(c<=1)
            return 1;
         return 0;
    }
    static int isPossible(String s){
        int n=s.length();
        if(n==1){
            return 1;
        }
        int c=0;
        int frequency[]=new int[26];
        for (int i = 0; i < n; i++) {
          frequency[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < n; i++) {
           if(frequency[s.charAt(i) -'a']!=0){
               c++;
           }
        }
      if(c>1){
          return 0;
      }
      return 1;
    }
    public static void main(String[] args) {
        String s="geeksogeeks";
        int res=isPossible(s);
        System.out.println("Final Result: " + res);
    }
}

