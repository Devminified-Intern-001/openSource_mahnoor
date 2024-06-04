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
        System.out.println("Enter 4th no:");
        int n4=t1.nextInt();
        int sum1=n1+n2;
        int sum2=n1+n2+n3;
        if(sum1==n3){
            System.out.println("The "+n1 +" and "+n2+" are bond of "+n3);
            System.out.println("The ");
        }
        else if(sum2==n4){
            System.out.println("The "+n1 +", "+n2+" and "+n3+" are bond of "+n4);
        }
        else {
            System.out.println("The "+n1 +" and "+n2+" are not a bond of "+n3);
            System.out.println("The "+n1 +", "+n2+" and "+n3+" are not a bond of "+n4);
        }
    }
}

