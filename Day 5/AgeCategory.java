import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age:");
        int age=sc.nextInt();
        
        String category;
        if(age<13){
            category="Child";
        }else if(age<20){
            category="Teen";
        }else if(age<60){
            category="Adult";
        }else{
            category="Senior";
        }

        System.out.println("you belong to the age category:"+category);
    }
    
}
