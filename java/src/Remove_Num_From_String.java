public class Remove_Num_From_String {

public  static void printString(String str) {
int n=str.length();
int sum=0;
String res="";
for(int i=0;i<n;i++){
    if(!Character.isDigit(str.charAt(i))){
        res=res+str.charAt(i);
    }else {
        String su="";
        while(i<n && Character.isDigit(str.charAt(i))){
            su=su+str.charAt(i);
            i++;
        }
        sum=sum+Integer.parseInt(su);
    }
}
    System.out.println(res);
    System.out.println(sum);
}
    public static void main(String[] args) {
    String s1="@You:HOw_5are_you.";
    String s2="1234HiHello678Everyone@GoodByeto#all1";
        printString(s1);
        printString(s2);
    }
}
