import java.util.Scanner;
//Exercise NO 8
public class Task3 {
    public static void main(String[]args){
        Scanner t1=new Scanner(System.in);
        System.out.println("Enter the Number between 0 to 20 inclusive");
        int num=t1.nextInt();
        if(num>20){
            System.out.println("Oops! This isn't in range");
        } else if (num>=0&&num<=20) {
            for (int i=1;i<=num;i++){
                System.out.print("*");
            }
        }
        else {
            System.out.println("You entered a negative input");
        }
    }
}
