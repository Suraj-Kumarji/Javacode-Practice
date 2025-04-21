import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=sc.nextInt();
        System.out.println("Enter the position to shift right:");
        int position=sc.nextInt();
        int result=number>>position;
        System.out.println("The result of shifting "+number+" to the right by "+position+" position is: "+result);
    }
    
}
