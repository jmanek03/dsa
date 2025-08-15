package com.jay.basics;
import java.util.*;

public class FibonacciSeries {
    static int Fibonacci(int n){
//        Recursive Approach
//        if(n<=1){
//            return n;
//        }
//        return Fibonacci(n-1)+Fibonacci(n-2);

//        Brute Force Approach
        int first=0;
        int second=1;
        for(int i=0;i<n;i++){
            int third =first+second;
            first=second;
            second=third;
        }
        return first;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fibonacci(n));
    }
}
