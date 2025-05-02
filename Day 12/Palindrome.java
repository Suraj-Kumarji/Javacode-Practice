import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();

        int orignum=num;
        int reversed=0;

        while(num!=0){
            int digit=num%10;
            reversed=reversed*10+digit;
            num/=10;
        }
        if(orignum==reversed){
            System.out.println(orignum+" is a palindrome.");
        }else{
            System.out.println(orignum+" is not a palindrome.");
        }

    }
    
}
