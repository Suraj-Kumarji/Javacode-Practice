import java.util.Scanner;

public class CompoundIntrestCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the principle amount:");
        double principal=sc.nextDouble();
        System.out.print("Enter the time period:");
        double time=sc.nextDouble();
        System.out.print("Enter the annual Rate:");
        double rate=sc.nextDouble();
        double compoundIntrest=principal*Math.pow((1+rate/100),time)-principal;
        System.out.println("The compound intrest is:"+compoundIntrest);

    }
    
}
