import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1=sc.nextInt();
        System.out.print("Enter second number:");
        int num2=sc.nextInt();

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " +gcd(num1,num2));
    }

    public static int gcd(int a,int b){
        while (b !=0) {
            int temp=b;
            b=a % b;
            a=temp;   
        }
        return a;
    }
    
}
