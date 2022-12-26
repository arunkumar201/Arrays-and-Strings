package InterviewBit;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public  static  int removeElement(ArrayList<Integer> li, int b) {
        int n=li.size();
//          li.removeIf(t->t==b);
        ArrayList<Integer> res=new ArrayList<Integer>();
        int j=0;
            for(int i:li){

                if(i==b){
                    continue;
                }else{
                    res.add(i);

                }
            }


        System.out.println(res);
         return res.size();

    }

    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>(Arrays.asList(4, 1, 1, 2, 1, 3));
        int b=1;
        int ans=removeElement(li,b);
        System.out.println("Final Ans is " + ans);
    }


}
