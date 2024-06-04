import java.util.Scanner;
//Exercise 12
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Enter positive integers (enter a negative integer to quit):");
        while (true) {
            int num = scanner.nextInt();
            if (num < 0) {
                System.out.println("Program is Ended!");
                break;
            }
            sum += num;
            count++;
            //Find maximum
            if (num > max) {
                max = num;
            }
//            Find minimum
            if (num < min) {
                min = num;
            }
        }
         if(count>0) {
           double mean = (double) sum / count;
           int range = max - min;
           System.out.println("Mean: " + mean);
           System.out.println("Maximum: " + max);
           System.out.println("Minimum: " + min);
           System.out.println("Range: " + range);
         }
         else{
             System.out.println("No number is entered");
         }
    }
}
