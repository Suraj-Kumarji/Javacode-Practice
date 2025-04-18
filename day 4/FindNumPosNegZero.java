// package Javacode-Practice.day 4;

import java.util.Scanner;

public class FindNumPosNegZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("Positive");
        }
        if (num<0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
