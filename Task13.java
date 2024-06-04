import java.util.Scanner;
//Exercise 5
public class Task13 {
    public static void main(String[] args){
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter Three numbers");
        int num1= obj1.nextInt();
        int num2=obj1.nextInt();
        int num3= obj1.nextInt();
        if(num1>num2& num1>num3){
            System.out.println("Number " +num1+"is greater");
        }
        else if(num2>num1 & num2>num3){
            System.out.println("Number"+num2+"is greater");

        } else if (num3>num1 & num3>num2) {
            System.out.println("Number "+num3+"is greater");
        }
        else {
            System.out.println("All are equal");
        }
    }
}

