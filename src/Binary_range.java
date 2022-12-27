public class Binary_range{

    static boolean checkConscucative1s(String s) {
      int num=s.length();
      int i=0;
      int c=0;
      while(i<num-1){
          if(s.charAt(i)=='1' && s.charAt(i+1)=='1'){
             c++;
             if(c<2)  return true;
          }
          i++;
      }
      return false;
    }
    public static void main(String[] args) {
        int m=125;
        int n=130;
        for(int i=m+1;i<n;i++){
            String b=Integer.toBinaryString(i);
            if ((i & (i >> 1))!=0){
                continue;
            }else{
                System.out.println(b);
            }
        }
        String v=Integer.toBinaryString(152);
        System.out.println(v);
        int x=1010;
        int dec=0;
        int i=0;
        while(x!=0) {
            int rem = x % 10;
            dec+=rem*(int)Math.pow(2,i);
            i++;
            x/=10;
        }
        System.out.println(dec);
    }

}
