package com.jay.patterns;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        for(int i = 0; i<23;i++){
//            System.out.println("Jay loves Riddhi SOlanki from Andheri");
//            System.out.println("Wifu hai Riddhi Solanki");
//            System.out.println("Riddhi jay ki kuchupuchu aur Jay riddhi ka kuchupuchu");
//
//        }
//        System.out.println("HEHEHEHHEHEHHEHHEE");
        // Sum of first n natural numbers
//        Scanner sc = new Scanner (System.in);
//        int number = sc.nextInt();
//        int sum = 0;
//        for(int i=1;i<=number;i++){
//            sum += i;
//        }
//        System.out.println(sum);

        //Multiplication Table
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int i= 1;
        while(i<=10){
            System.out.println(number + " * " + i  + " = " +(number*i));
            i++;
        }
    }
}
