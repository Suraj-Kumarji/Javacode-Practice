import java.util.Scanner;

public class SimpleIntrestCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the principal amount:");
        int principal=sc.nextInt();
        System.out.print("Enter the time peroid:");
        int time=sc.nextInt();
        System.out.print("Enter the annual rate :");
        int rate=sc.nextInt();
        int simpleIntrest=(principal*rate*time)/100;
        System.out.println("The simple interest is:"+simpleIntrest);

    }
    
}
