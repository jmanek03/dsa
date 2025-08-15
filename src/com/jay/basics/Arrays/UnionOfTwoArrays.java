package com.jay.basics.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UnionOfTwoArrays {
    static ArrayList<Integer> Union(int[] arr1, int[] arr2, int size1, int size2){
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> Union = new ArrayList<>();
        for(int i =0;i<=size1-1;i++){
            freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1 );
        }

        for(int i =0;i<=size2-1;i++){
            freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1 );
        }

        for(int it : freq.keySet()){
            Union.add(it);
        }
        return Union;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for(int i =0; i<=size1-1;i++){
            arr1[i] = sc.nextInt();
        }
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for(int i =0; i<=size2-1;i++){
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> Union = Union(arr1,arr2, size1, size2);

        for(int val:Union){
            System.out.print(val+" ");
        }
    }
}
