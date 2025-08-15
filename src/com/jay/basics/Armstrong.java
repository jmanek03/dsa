package com.jay.basics;
import java.util.*;
public class Armstrong {
    public static boolean checkArmstrong(int n){
        int count = (int) (Math.log10(n)+1);
        int sum = 0;
        int temp = n;

        while(temp>0){
            int lastDigit = temp%10;
            temp = temp/10;
            sum += (int) Math.pow(lastDigit, count);
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(checkArmstrong(number));
    }
}
