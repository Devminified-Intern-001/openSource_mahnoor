import java.util.Scanner;
//Exercise 4
public class Task10 {
    public static void main(String[] args){
        Scanner obj2=new Scanner(System.in);
        System.out.println("Enter age of yours in numeerics");
        int age=obj2.nextInt();
        if(age<18){
            System.out.println("You are too Young");
        }
        else if (age>18 & age<50){
            System.out.println("User may Proceed");
        }
        else{
            System.out.println("You're too Old");
        }
    }
}
