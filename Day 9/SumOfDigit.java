import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num:");
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        System.out.println("Sum of digit:"+sum);
    }
    
}
