package com.jay.basics;
import java.util.*;

import static com.jay.basics.ReverseNumber.revNum;

public class Pallindrome {
    public static boolean checkPallindrome(int n){
        int temp = n;
        if(n<0){
            return false;
        }
        int revNum = revNum(n);
        System.out.println(revNum);
        return temp == revNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(checkPallindrome(number));
    }
}
