package com.jay.basics.Sorting;
import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSortAlgorithm(int[] arr, int size){
        int didSwap = 0;
//        for(int i = size-1; i >= 0; i--){
//            for(int j = 0; j <= i-1; j++){
//                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    didSwap = 1;
//                }
//            }
//            if(didSwap == 0){
//                break;
//            }
//        }
        //Recursive Approach
        if(size==1) return;
        for(int j=0; j<=size-2;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }

        }
        bubbleSortAlgorithm(arr, size-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSortAlgorithm(arr ,size);
        for(int i =0; i < size ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
