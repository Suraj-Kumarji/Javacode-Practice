import java.util.Scanner;

public class Name_input{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Welcome "+name+" to skill development training.");
    }
}