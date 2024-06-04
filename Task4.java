import java.util.Scanner;
//Exercise no 9
public class Task4 {
    public static void main(String[]args){
        Scanner t1=new Scanner(System.in);
        System.out.println("Enter the number between 0-100 inclusive");
        int num1=t1.nextInt();
        int result=num1*5;
        System.out.print("The Result is "+num1+"*5="+result);
    }
}
