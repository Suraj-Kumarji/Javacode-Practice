import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num:");
        int num=sc.nextInt();

        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("The factorial of "+num+" = "+fact);
    }
    
}
