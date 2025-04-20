import java.util.Scanner;

public class BitwiseOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1=sc.nextInt();
        System.out.print("Enter second number:");
        int num2=sc.nextInt();
        int result=num1 | num2;
        System.out.println("Bitwise OR of "+num1+" and "+num2+" is: "+result);
    }
    
}
