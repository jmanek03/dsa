package com.jay.basics;
import java.util.*;

public class GCD {
    public static int checkGCD(int a,int b){
        int gcd = 1;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0&&b%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println(checkGCD(number1, number2));
    }
}
