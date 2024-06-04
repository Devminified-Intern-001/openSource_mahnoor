import java.util.Scanner;
//Exercise No 2
public class Main {
    public static void main(String[] args) {
        Scanner t1=new Scanner(System.in);
        System.out.println("Enter First Number 1:");
        int num1=t1.nextInt();
        System.out.println("Enter Second Number 2:");
        int num2=t1.nextInt();
        int product=num1*num2;
        if (product<100){
            System.out.println("Product is less than 100");

        } else if (product==100) {
            System.out.println("Product is Equal to 100");

        } else{
            System.out.println("Product is greater than 100");
        }
    }
}
