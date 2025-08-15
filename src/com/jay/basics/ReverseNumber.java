//You are given an integer n. Return the integer formed by placing the digits of n in reverse order.

package com.jay.basics;
import java.util.*;

public class ReverseNumber {
    public static int revNum(int n){
//        int revNum = 0;
//        while(n>0){
//            int lastDigit = n%10;
//            revNum = (revNum*10) +lastDigit;
//            n=n/10;
//        }
//        return revNum;

        //Handling Integer values (LeetCode)
        //Given a signed 32-bit integer x, return x with its digits reversed.
        //If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
        int revNum = 0;
        while(n!=0){
            int lastDigit = n%10;

            if(revNum > Integer.MAX_VALUE/10 || revNum < Integer.MIN_VALUE/10){
                return 0;
            }
            revNum = (revNum*10) +lastDigit;
            n=n/10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(revNum(number));
    }
}
