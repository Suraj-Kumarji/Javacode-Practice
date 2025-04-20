import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your marks:");
        int marks=sc.nextInt();

        char grade;
        if(marks>90){
            grade='A';
        }else if(marks>75){
            grade='B';
        }else if(marks>60){
            grade='c';
        }else if(marks>30){
            grade='D';
        }else{
            grade='F';
        }
        System.out.println("Your grade is:"+grade);
    }
    
}
