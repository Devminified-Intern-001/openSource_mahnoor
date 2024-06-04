import java.util.Scanner;
public class Task8 {
//    Exercise 13
    public static void main(String[]args){
        Scanner t1=new Scanner(System.in);
        System.out.println("Enter strings (enter 'quit' to exit):");
        int totalLength = 0;
        int count = 0;
        int maxLength = Integer.MIN_VALUE;
        int minLength = Integer.MAX_VALUE;
        while (true){
            String input=t1.nextLine();
            if(input.equals("quit")||input.equals("Quit")){
                break;
            }
            int length=input.length();
            totalLength+=length;
            if (length > maxLength) {
                maxLength = length;
            }

            // Update minimum length
            if (length < minLength) {
                minLength = length;
            }
            count++;
        }
        if (count > 0) {
            double meanLength = (double) totalLength / count;
            System.out.println("Mean length of the strings: " + meanLength);
            System.out.println("Length of the longest string: " + maxLength);
            System.out.println("Length of the shortest string: " + minLength);
        } else {
            System.out.println("No strings entered.");
        }
    }
}
