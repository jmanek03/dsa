package com.jay.basics.Arrays;

import java.util.*;

public class MajorityElement {
    public static List<Integer> findMajorityElement(int[] arr, int size){
        List<Integer> answerList = new ArrayList<>();
//        Brute Force Approach
//        for(int i =0;i<=size-1;i++){
//            if(answerList.isEmpty() || answerList.getFirst()!= arr[i]){
//                int count = 0;
//                for(int j = 0 ;j<=size-1;j++){
//                    if(arr[j] == arr[i]){
//                        count++;
//                    }
//                }
//
//                if(count > (size/3)){
//                    answerList.add(arr[i]);
//                }
//                if(answerList.size() == 2) break;
//            }
//        }
//        Using HashMap
        int mini = (int)(size / 3) + 1;
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int i =0;i<=size-1;i++){
//            int value = map.getOrDefault(arr[i], 0);
//            map.put(arr[i], value+1);
//
//            if(map.get(arr[i]) == mini){
//                answerList.add(arr[i]);
//            }
//            if(answerList.size()==2) break;
//        }

//        Advanced Moore's voting algorithm
        int cnt1=0, cnt2 = 0;
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
        for(int i =0;i<=size-1;i++){
            if(cnt1 == 0 && ele2!= arr[i]){
                cnt1 = 1;
                ele1 = arr[i];
            }else if(cnt2 == 0 && ele1!=arr[i]){
                cnt2=1;
                ele2 = arr[i];
            }else if(arr[i] == ele1) cnt1++;
            else if(arr[i] == ele2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }

        cnt1= 0; cnt2=0;
        for(int i =0;i<=size-1;i++){
            if(arr[i] == ele1) cnt1++;
            if(arr[i] == ele2) cnt2++;
        }

        if(cnt1>= mini) answerList.add(ele1);
        if(cnt2>=mini) answerList.add(ele2);


        return answerList;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i =0;i<=size-1;i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> ans = findMajorityElement(arr,size);
        System.out.println(ans);
    }
}
