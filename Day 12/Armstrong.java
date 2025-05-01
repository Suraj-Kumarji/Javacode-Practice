import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();

        System.out.println("Is Armstrong number: "+IsArmstrong(num));
    }

    static boolean IsArmstrong(int n){
        int digits=0,temp;
        int sum=0;
        temp=n;
        while(temp>0){
            temp=temp/10;
            digits++;
        }
        System.out.println("Number of digits:"+digits);
        temp=n;
        while(temp>0){
            int lastDigit=temp % 10;
            sum= (int) (sum+Math.pow(lastDigit, digits));
            temp=temp/10;
        }
        System.out.println("Sum is:"+sum);
        if(sum==n)
            return true;

        return false;    
    }
    
}
