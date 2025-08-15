package com.jay.basics;
import java.util.*;
public class Prime {
    public static boolean checkPrime(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) {
                count++;
            }
        }
        return count == 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(checkPrime(number));
    }
}
