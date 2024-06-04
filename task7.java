import java.util.Scanner;
//Exercise 14
public class task7 {
    public static void main(String[]args){
        Scanner t1=new Scanner(System.in);
        int totalstar = 0;

        System.out.println("Enter strings (enter 'quit' to exit):");

        while (true) {
            String input = t1.nextLine();

            if (input.equals("quit")||input.equals("Quit")) {
                break;
            }
            totalstar += countAsterisks(input);
        }System.out.println("Total number of '*' symbols entered: " + totalstar);
    }
    public static int countAsterisks(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '*') {
                count++;
            }
        }

        return count;

    }
}
