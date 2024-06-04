import java.util.Scanner;
//Exercise 7
public class Task12 {
    public static void main(String[]args){
        Scanner obj4=new Scanner(System.in);
        System.out.println("Enter Pkr amount");
        float number= obj4.nextFloat();
        System.out.println("1. pkr to usd");
        System.out.println("2. pkr to aus");
        System.out.println("3. pkr to euros");
        System.out.println("Enter which you want to convert");
        int num= obj4.nextInt();
        switch (num){
            case 1:
                System.out.println("PKR to USD");
                System.out.println("Usd Dollars are:"+ number/306.44);
                break;
            case 2:
                System.out.println("PKR to AUS");
                System.out.println("AUS dollars are:" + number/197.5);
                break;
            case 3:
                System.out.println("PKR to euros");
                System.out.println("AUS dollars are:" + number/328.50);
                break;
        }
    }
}
