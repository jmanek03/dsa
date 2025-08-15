package com.jay.patterns;
import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n; i++){
            printPattern(n, i);
        }

        //Mirror
        for(int i=n;i>=1; i--){
            printPattern(n, i);
        }
    }

    private static void printPattern(int n, int i) {
        for(int j=1;j<=i;j++){              //First part
            System.out.print("*");
        }
        for(int j=1;j<=2*(n-i);j++){        //Spaces
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){              //Second Part
            System.out.print("*");
        }
        System.out.println();
    }
}
