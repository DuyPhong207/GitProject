import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter phone number: ");
            String phone = sc.nextLine();
            Pattern p = Pattern.compile("^\\([0-9]{2}\\)-\\(0{1}[0-9]{9}\\)$");
            if (p.matcher(phone).find()) {
                System.out.println("Valid.");
                break;
            } else {
                System.err.println("Invalid");
            }
        }
    }
}
