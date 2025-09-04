package com.jay.basics.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FloorInSortedArray {
    private static int findCeil(int[] arr,int size,int x){
    int low = 0, high = size-1;
    int ans = -1;
    while(low<=high){
        int mid = (low+high)/2;

        if(arr[mid]>=x){
            ans = arr[mid];
            high = mid-1;
        }else{
            low = mid+1;
        }
    }
    return ans;
}
    private static int findFloor(int[] arr,int size,int x){
        int low = 0, high = size-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]<=x){
                ans = arr[mid];
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static int[] findFloorAndCeil(int[] arr, int size, int x){
        int f= findFloor(arr,size,x);
        int c= findCeil(arr,size,x);
        return new int[] {f,c};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<=size-1;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int[] ans = findFloorAndCeil(arr,size,x);
        System.out.println(Arrays.toString(ans));


    }
}
