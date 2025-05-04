import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int num=sc.nextInt();

        int[] arr=new int[num];
        int sum=0;

        System.out.println("Enter "+num+" numbers:");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        double average=(double) sum/num;
        System.out.println("Sum: "+sum+", Average: "+average);
    }
}
