import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first num:");
        double num1=sc.nextDouble();
        System.out.print("Enter second num:");
        double num2=sc.nextDouble();
        System.out.print("Enter third num:");
        double num3=sc.nextDouble();
        double greatest;
        if(num1>=num2 && num1>=num3){
            greatest=num1;
        }else if(num2>=num1 && num2>=num3){
            greatest=num2;
        }else{
            greatest=num3;
        }
        System.out.println("The greatest number is:"+greatest);
    }
    
}
