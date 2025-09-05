package com.jay.basics.BinarySearch;

import java.util.Scanner;

public class SqrtUsingLS {
    public static int sqrtUsingLS(int n){
//        Brute Force Approach
//        int ans = 0;
//        for(int i =1;i<=n;i++){
//            if(i*i <=n){
//                ans = i;
//            }else{
//                break;
//            }
//        }
//        return ans;

//        Optimize Approach Using BS
        int low=1,high=n;
        while(low<=high){
            int mid= (low+high)/2;
            if(mid*mid<=n)
                low = mid+1;
            else
                high = mid-1;
        }
        return high;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sqrtUsingLS(n));
    }
}
