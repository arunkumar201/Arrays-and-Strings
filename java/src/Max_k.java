import java.util.ArrayList;
import java.util.HashMap;

public class Max_k {
    //https://bit.ly/3THNMe6
    static ArrayList<Integer> max_of_subarrays(int a[], int n, int k) {
        ArrayList<Integer> li = new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;
        for (j=0;j<k;j++) {
            mp.put(j,a[j]);
            max=Math.max(max,a[j]);
        }
        i=1;
//        System.out.println(j);
        li.add(max);
        mp.remove(0);
        while(j<n){
            if(mp.containsKey(max) && max>a[j]){
                li.add(max);
                mp.put(j,a[j]);
                mp.remove(i);
                i++;
                j++;
            }
            else if(mp.containsKey(max) && max<a[j]){
                li.add(a[j]);
                mp.put(j,a[j]);
                mp.remove(i);
                i++;
                j++;
            }
            else  {
                int fmx=Integer.MIN_VALUE;
                for(int z=i;z<=j;z++){
                    fmx=Math.max(fmx, a[z]);
                }
                li.add(fmx);
                mp.put(j,a[j]);
                mp.remove(i);
                i++;
                j++;

            }
        }

        return li;
    }

    public static void main(String[] args) {
//        int a[]={1909,1209,1758,1221,1588,1422,1946,1506,1030,1413,1168,1900,1591,1762,1655,1410,1359,1624,1537,1548,1483,1595,1041,1602,1350,1291,1836,1374,1020,1596,1021,1348,1199,1668,1484,1281,1734,1053,1999,1418,1938,1900,1788,1127,1467,1728,1893,1648,1483,1807,1421,1310,1617,1813,1514,1309,1616,1935,1451,1600,1249,1519,1556,1798,1303,1224,1008,1844,1609,1989,1702,1195,1485,1093,1343,1523,1587,1314,1503,1448,1200,1458,1618,1580,1796,1798,1281,1589,1798,1009,1157,1472,1622,1538,1292,1038,1179,1190,1657,1958,1191,1815,1888,1156,1511,1202,1634,1272,1055,1328,1646,1362,1886,1875,1433,1869,1142,1844,1416,1881,1998,1322,1651,1021,1699,1557,1476,1892,1389,1075,1712,1600,1510,1003,1869,1861,1688,1401,1789,1255,1423,1002,1585,1182,1285,1088,1426,1617,1757,1832,1932,1169,1154,1721,1189,1976,1329,1368,1692,1425,1555,1434,1549,1441,1512,1145,1060,1718,1753,1139,1423,1279,1996,1687,1529,1549,1437,1866,1949,1193,1195,1297,1416};
       int a[]={8,5,10,7,9,4,15,12,90,13};
        int n=a.length;
        int k=4;
        ArrayList<Integer> li=max_of_subarrays(a,n,k);
        System.out.println("Final result: " +li);
    }
}
