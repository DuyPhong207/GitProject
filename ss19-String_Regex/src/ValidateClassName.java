import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateClassName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter class name: \n");
            String className = sc.nextLine();
            Pattern p = Pattern.compile("^[C|A|P]{1}[0-9]{4}[G|H|I|K|L|M]{1}$");
            if (p.matcher(className).find()) {
                System.out.println("valid");
                break;
            } else {
                System.err.println("Invalid!");
            }
        }
    }
}
