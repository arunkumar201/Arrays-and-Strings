
import java.util.*;
public class TestClass{
    static  boolean reverse(String str){
        int l=0;
        int h=str.length()-1;
        while(l<=h){

            if(str.charAt(l)!=str.charAt(h)){
                return false;
            }
        }
        return true;

    }

    public static void main ( String args[] ) throws Exception {

        Scanner sc = new Scanner ( System.in );
        byte n = sc.nextByte();
        // HashSet<String> hs = new HashSet<>(n);
        HashMap<String,Boolean> mp=new HashMap<>(n);
        String str;
        for( int i=0;i<n;i++){
            str=sc.next();
            boolean b=reverse(str);
            if(mp.containsKey(str) && mp.containsValue(true))
            {
                int n1=str.length();
                int mid=n1/2;
                System.out.println (n1+" "+str.charAt(mid));
                break;

            }
            else{
                mp.put(str,b);
            }
        }




    }
}