
import java.util.*;
class PasswordProblem {
    static  String reverse(String str){
        String nstr="";
        char ch;
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
//        System.out.println (nstr);
        return nstr;
    }
    public static void main ( String args[] ) throws Exception {

//   HashSet<Strings> hs=new HashSet<Strings> ();
        Scanner sc = new Scanner ( System.in );
        int n = sc.nextInt();
        HashSet<String> hs = new HashSet<String>();
        String[] a = new String[n];
//     String []a={"abc","cba","cfv","fgf"};

        for ( int i = 0 ; i < n ; i++ ) {
            a[i]= sc.next ();
        }

        for(int i=0;i<n;i++){
            hs.add(a[i]);
        }
        for( int i=0;i<n;i++){
            String s=reverse(a[i]);
            if(hs.contains(s))
            {

                int n1=s.length();
                int mid=n1/2;
//                System.out.println ("this is mid"+mid);
//                System.out.println ("this is length"+n1);
                System.out.println (n1+" "+s.charAt(mid));
                break;
            }
        }



    }
}