package com.company;

import static java.lang.Math.max;

public class BuyAndSell {

    static int maxProfit(int[] a) {
        int n = a.length;
        int max1 = Integer.MIN_VALUE;
        int x = 0;
        int i = 0;
        for (i = 0; i < n; i++) {
            x = a[i];
            for (int j = i + 1; j <= n - 1; j++) {
                int diff = a[j] - x;
                if (diff >= x && diff > max1) {
                    max1 = max(max1, diff);

                }
            }
        }
        if (max1 < 0) {
            return 0;
        }
        return max1;

    }

    public static void main(String[] args) {
//        int []a={7,1,5,3,6,4};
        int[] a = {1, 2};
        int n = a.length;
        int ans = maxProfit(a);
        System.out.println("Max Profit:" + ans);

    }
}
