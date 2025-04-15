// package Javacode-Practice.Day 2;

import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of rectangle:");
        double length=sc.nextDouble();
        System.out.print("Enter the width of rectangle:");
        double width=sc.nextDouble();
        double perimeter=2*(length+width);
        System.out.println("Perimeter of rectangle is: "+perimeter);
    }
    
}
