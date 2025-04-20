import java.util.Scanner;

public class BitwiseAND {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first num:");
        int num1=sc.nextInt();
        System.out.print("Enter second num:");
        int num2=sc.nextInt();

        int result=num1 & num2;
        System.out.println("Bitwise AND of "+num1+" and "+num2+" is: "+result);
    }
}
