import java.util.Scanner;
//Exercise No 3
public class Task2 {
    public static void main(String[] args){
        Scanner t1=new Scanner(System.in);
        System.out.println("Enter 1st no:");
        int n1=t1.nextInt();
        System.out.println("Enter 2nd no:");
        int n2=t1.nextInt();
        System.out.println("Enter 3rd no:");
        int n3=t1.nextInt();
        int sum=n1+n2;
        if(sum==n3){
            System.out.println("The "+n1 +" and "+n2+" are bond of "+n3);
        }
        else {
            System.out.println("The "+n1 +" and "+n2+" are not a bond of "+n3);
        }
    }
}

