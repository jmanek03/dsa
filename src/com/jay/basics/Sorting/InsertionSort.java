package com.jay.basics.Sorting;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSortAlgorithm(int[] arr, int size){
        for(int i = 0; i<=size-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for(int i =0; i < size ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void recursiveInsertionSortAlgorithm(int[] arr,int i, int size){
        if(i == size) return;
        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        recursiveInsertionSortAlgorithm(arr, i+1, size);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
//        insertionSortAlgorithm(arr , size);
        recursiveInsertionSortAlgorithm(arr ,0 ,size);
        for(int i =0; i < size ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
