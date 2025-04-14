// package Javacode-Practice.Day 1;

import java.util.Scanner;

public class Swap_twoNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st num:");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd num:");
        int num2=sc.nextInt();
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping:");
        System.out.println("First num:"+num1);
        System.out.println("Second num:"+num2);
    }
}
