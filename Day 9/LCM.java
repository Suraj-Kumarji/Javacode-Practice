import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first num:");
        int num1=sc.nextInt();
        System.out.print("Enter second num:");
        int num2=sc.nextInt();
        int lcm = (num1 > num2) ? num1 : num2;
        
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
                break;
            }
            lcm++;
        }
    }
}
