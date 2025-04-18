// package Javacode-Practice.day 4;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the temperature in fahrenheit:");
        double temperature=sc.nextDouble();
        double celsius=(temperature-32)*5/9;
        System.out.println("The temperature in celcius:"+celsius);
    }
    
}
