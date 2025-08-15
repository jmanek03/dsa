package com.jay.basics.Hashing;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFreq {
    public static void countFreq(int[] arr, int size){
        boolean[] visited= new boolean[size];
        int maxFreq=0, maxElement=0, minFreq=size, minElement=0;
        for(int i=0;i<size;i++){
            if(visited[i]){
                continue;
            }
            int count= 1;
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+" "+count);
            if(count>maxFreq){
                maxFreq=count;
                maxElement=arr[i];
            }
            if(count<minFreq){
                minFreq=count;
                minElement=arr[i];
            }
        }
        System.out.println(maxFreq+" "+maxElement+" "+minFreq+" "+minElement);
    }

    public static void countFreqMap(int[] arr, int size){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<size;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int maxFreq=0, minFreq=size,maxElement=0, minElement=-0;
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
            if(entry.getValue()>maxFreq){
                maxFreq=entry.getValue();
                maxElement=entry.getKey();
            }
            if(entry.getValue()<minFreq){
                minFreq=entry.getValue();
                minElement=entry.getKey();
            }
        }
        System.out.println(maxFreq+" "+maxElement+" "+minFreq+" "+minElement);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =  sc.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        countFreq(arr,size);
        countFreqMap(arr, size);
    }
}
