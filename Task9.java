import java.util.Scanner;
import java.util.regex.Pattern;
//Exercise 6
public class Task9 {
     public static void main(String[]args){
         Scanner t1=new Scanner(System.in);
         System.out.println("Enter the code in the format of 'abxyc' ");
         String code=t1.nextLine();
         if (valid(code)){
             System.out.println("The "+code+" has Correct format.");
         }
         else{
             System.out.println("Input is InCorrect");
             System.out.println("a and b are single digits");
             System.out.println("x and y are alphabetic characters");
             System.out.println(" c is a single digit.");
         }
     }
     public static boolean valid(String code){
         String pattern = "\\d{1}[a-zA-Z]{1}\\d{1}[a-zA-Z]{1}\\d{1}";
         return Pattern.matches(pattern,code);

     }
}
