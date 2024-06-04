import java.util.Scanner;
//Exercise 15
public class password {
    public static void main(String[] args) {
        Scanner t1 = new Scanner(System.in);
        System.out.println("Enter a password:");
        String password = t1.nextLine();
        boolean Valid = ValidPassword(password);

        if (Valid) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is not valid for the following reasons:");
            if (password.length() < 8 || password.length() > 12) {
                System.out.println("- Password must be between 8 and 12 characters.");
            }
            if (!UpperCase(password)) {
                System.out.println("- Password must contain at least one uppercase letter.");
            }
            if (!LowerCase(password)) {
                System.out.println("- Password must contain at least one lowercase letter.");
            }
            if (!Digit(password)) {
                System.out.println("- Password must contain at least one digit.");
            }
            if (InvalidCharacters(password)) {
                System.out.println("- Password contains invalid characters.");
            }
        }
    }

    public static boolean ValidPassword(String password) {
        if (password.length() < 8 || password.length() > 12) {
            return false;
        }

        if (!UpperCase(password)) {
            return false;
        }

        if (!LowerCase(password)) {
            return false;
        }

        if (!Digit(password)) {
            return false;
        }

        if (InvalidCharacters(password)) {
            return false;
        }

        return true;
    }

    public static boolean UpperCase(String s) {
//    foreach loop
        for (char c : s.toCharArray()) {

            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LowerCase(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean Digit(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean InvalidCharacters(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '_') {
                return true;
            }
        }
        return false;
    }
}
