import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ChuoiTangDanLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: \n");
        String str = sc.nextLine();
        LinkedList<Character> characterList = new LinkedList<>();
        characterList.add(str.charAt(0));
        for (int i = 1;i < str.length();i++) {
            if (str.charAt(i) > characterList.getLast()) {
                characterList.add(str.charAt(i));
            }
        }
        System.out.println("Result: ");
        for (Character character : characterList) {
            System.out.print(character);
        }
    }
}
