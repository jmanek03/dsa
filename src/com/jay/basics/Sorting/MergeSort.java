package com.jay.basics.Sorting;
import java.util.ArrayList;
import java.util.Scanner;

class Solution{
    private static void merge(int[] array, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;         //starting index of left half of array
        int right = mid+1;      //startig index of right half of array


        //storing elements in a temp array in a sorted manner
        while(left<=mid &&  right<=high){
            if(array[left]<=array[right]){
                temp.add(array[left]);
                left++;
            }else{
                temp.add(array[right]);
                right++;
            }
        }

        //if elements in the left half are still remaining
        while(left<=mid){
            temp.add(array[left]);
            left++;
        }

        //if elements in the right half are still remaining
        while(right<=high){
            temp.add(array[right]);
            right++;
        }

        //transfer all elements from temp array to array
        for(int i = low; i<=high;i++){
            array[i]= temp.get(i-low);
        }
    }
    public static void mergeSortAlgorithm(int[] array, int low, int high){
        if(low>=high) return;
        int mid = (low+high)/2;
        mergeSortAlgorithm(array, low, mid);            //left-half
        mergeSortAlgorithm(array, mid+1, high);     //right-half
        merge(array, low,mid,high);                    //merge sorted halves

    }
}

public class MergeSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i =0; i<size;i++){
            array[i] = sc.nextInt();
        }
        Solution.mergeSortAlgorithm(array, 0 ,size-1);
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
