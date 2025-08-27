package com.jay.basics.Arrays;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] arr, int size){
        Set<List<Integer>> set = new HashSet<>();

//        Brute Force Approach
//        for(int i= 0;i<=size-1;i++){
//            for(int j =i+1;j<=size-1;j++){
//                for( int k = j+1;k<=size-1;k++){
//                    if(arr[i] + arr[j] + arr[k] == 0){
//                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
//                        temp.sort(null);
//                        set.add(temp);
//                    }
//                }
//            }
//        }

//        Using two loops
        for(int i =0;i<=size-1;i++){
            Set<Integer> hashset = new HashSet<>();
            for(int j =i+1;j<=size-1;j++){
                int third = -(arr[i] + arr[j]);

                if(hashset.contains(third)){
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    set.add(temp);
                }
                hashset.add(arr[j]);
            }
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<=size-1;i++){
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> ans = threeSum(arr,size);
        System.out.println(ans);

    }
}
