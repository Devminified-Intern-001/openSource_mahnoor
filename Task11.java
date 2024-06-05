import java.util.Scanner;
//Exercise 1
//Java first program for even odd numbers
public class Task11 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the integer which is positive+ve :");
        int num=obj.nextInt();
        if(num%2==0){
            System.out.println("It is Even Number" + num);
        }
        else
            System.out.println("it is odd number" + num);
    }
}
