package com.jay.patterns;
import java.util.Scanner;
public class HalfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        Half Pyramid
//        for ( int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

//      Inverted Half pyramid
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//      Right Pyramid
//        for(int i=1;i<=n;i++){
//            for ( int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
        // Increasing Number Triangle
//        for(int i =1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        //Inverted Number Triangle
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        //Floyds Triangle
//        int number=1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(number + " ");
//                number++;
//            }
//            System.out.println();
//        }
        //0-1 Triangle
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
//                if((i%2!=0&&j%2!=0) || (i%2==0&&j%2==0)){   //My Approach
                if((i+j)%2==0){
                    System.out.print("1");
                }else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
}
