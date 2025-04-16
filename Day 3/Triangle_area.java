// package Javacode-Practice.Day 3;

import java.util.Scanner;

public class Triangle_area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base of triangle:");
        double base=sc.nextDouble();
        System.out.print("Enter the height of triangle:");
        double height=sc.nextDouble();
        double area=0.5*base*height;
        System.out.println("The area of triangle is:"+area);
    }
    
}
