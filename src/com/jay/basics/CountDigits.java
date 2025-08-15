//You are given an integer n. You need to return the number of digits in the number.
//The number will have no leading zeroes, except when the number is 0 itself.

package com.jay.basics;
import java.util.Scanner;

public class CountDigits {
    public static int Count(int n){
//        Brute-Force
//        int count = 0;
//
//        while(n>0){
//            count++;
//            n=n/10;
//        }
//        return count;

        //Optimal
        return (int) (Math.log10(n) +1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int numberOfDigits = Count(number);
        System.out.println(numberOfDigits);
    }
}

