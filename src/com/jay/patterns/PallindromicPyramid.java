package com.jay.patterns;
import java.util.Scanner;
public class PallindromicPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){         //Spaces
            for(int j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){      //1st Half Numbers
                System.out.print(j);
            }
            for(int j= 2; j<=i; j++){   //2nd Half Numbers
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
