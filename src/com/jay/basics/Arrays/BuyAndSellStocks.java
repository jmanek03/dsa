package com.jay.basics.Arrays;

import java.util.Scanner;

public class BuyAndSellStocks {
    public static int buyAndSellStocks(int[] arr, int size){
        int maxProfit = 0;
//        Brutal Approach
//        for(int i =0;i<=size-1;i++){
//            for(int j = i+1;j<=size-1;j++){
//                if(arr[j]>arr[i]){
//                    maxProfit = Math.max(arr[j]-arr[i],maxProfit);
//                }
//            }
//        }

//        Optimal Approach
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0;i<=size-1;i++){
            minPrice = Math.min(minPrice , arr[i]);
            maxProfit = Math.max(maxProfit, arr[i]-minPrice);
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0; i<=size-1;i++){
            arr[i] = sc.nextInt();
        }
        int ans = buyAndSellStocks(arr,size);
        System.out.println(ans);
    }
}
