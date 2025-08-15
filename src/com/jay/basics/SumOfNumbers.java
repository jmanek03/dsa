package com.jay.basics;
import java.util.Scanner;
public class SumOfNumbers {
    public static int Sum(int n){
        if(n==0){
            return 0;
        }
        return n+Sum(n-1);
    }
    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        return n*Factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sum(n));
        System.out.println(Factorial(n));
    }
}
