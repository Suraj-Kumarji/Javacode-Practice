import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int num=sc.nextInt();

        int firstTerm=0, secondTerm=1;
        System.out.println("Fibonacci Series up to "+num+" terms: ");

        for(int i=1;i<=num;++i){
            System.out.println(firstTerm+" ");
            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
    }
    
}
