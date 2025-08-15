package com.jay.basics.Sorting;
import java.util.Scanner;

public class SelectionSort {
    public static void selectionSortAlgorithm(int[] arr, int size){
        for(int i = 0; i < size-1; i++){
            int smallNumber = i;
            for(int j = i+1; j < size; j++){
                if(arr[j] < arr[smallNumber]){
                    smallNumber = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallNumber];
            arr[smallNumber] = temp;
        }

        System.out.println("Sorted Array: ");
        for(int i = 0; i < size ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSortAlgorithm(arr, size);

    }
}
