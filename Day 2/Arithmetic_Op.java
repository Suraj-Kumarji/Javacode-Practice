// package Javacode-Practice.Day 2;

import java.util.Scanner;

public class Arithmetic_Op {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first num:");
        double num1=sc.nextDouble();
        System.out.print("Enter second num:");
        double num2=sc.nextDouble();

        System.out.println("Addition: "+num1+" + "+num2+" = "+(num1+num2));
        System.out.println("Subtraction: "+num1+" - "+num2+" = "+(num1-num2));
        System.out.println("Multiplication: "+num1+" * "+num2+" = "+(num1*num2));
        if(num2!=0){
            System.out.println("Division: "+num1+" / "+num2+" = "+(num1/num2));
        }else{
            System.out.println("Division:Can't divide by zero");
        }
        if(num2!=0){
            System.out.println("Modulus: "+num1+" % "+num2+" = "+(num1%num2));
        }else{
            System.out.println("Modulus:Can't divide by zero");

        }
       
    }
    
}
