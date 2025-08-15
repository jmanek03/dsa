package com.jay.basics;
import java.util.Scanner;

public class PallindromeString {
//    Normal Approach
    public static boolean checkPallindrome(String str){
        int left = 0, right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
// Recursive Approach
    public static boolean checkPallindrome(int start, String str){
        if(start>str.length()/2){
            return true;
        }
        if(str.charAt(start)!=str.charAt(str.length()-1-start)){
            return false;
        }
        return checkPallindrome(start+1,str);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int start = 0;
        System.out.println(checkPallindrome(str));
        System.out.println(checkPallindrome(start,str));
    }
}
