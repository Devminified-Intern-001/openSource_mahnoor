import java.util.Scanner;
//Exercise No11
public class Task5 {
    public static void main(String[]args){
        Scanner t1=new Scanner(System.in);
        while (true){
            System.out.println("Enter the Positive integer:");
            int n1=t1.nextInt();
            if(n1<0){
                System.out.println("Program is Ended!");
                break;
            }
            else{
                int result=n1*n1;
                System.out.println("The square of the "+n1+" is:"+result);
            }
        }
    }
}
