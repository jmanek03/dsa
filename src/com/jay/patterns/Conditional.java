package com.jay.patterns;
import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//
//        if(age<18){
//            System.out.println("Minor hai tu");
//        }else
//            System.out.println("Major hai tu");
//        int number = sc.nextInt();
//        if(number%2==0)
//            System.out.println("Even hai tu");
//        else
//            System.out.println("odd hai tu");
//        int andu = sc.nextInt();
//        int bandu = sc.nextInt();
//
//        if (andu == bandu)
//            System.out.println("Equal hai tu");
//        else if (andu>bandu) {
//            System.out.println("andu bada hai bandu se");
//        }
//        else
//            System.out.println("andu chhota hai bandu se");

//        int button = sc.nextInt();
//        if (button == 1)
//            System.out.println("Hello");
//        else if(button ==2)
//            System.out.println("Namaste");
//        else if(button == 3)
//            System.out.println("Bonjour");
//        else
//            System.out.println("Galat button hai re baba");
        int button = sc.nextInt();
        switch(button){
            case 1:
                System.out.println("Namaste");
                break;
            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Galat button hai re baba");
                break;
        }
    }
}
