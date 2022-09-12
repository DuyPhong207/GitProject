package TuTrongChuoi;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string: \n");
        String str = sc.nextLine();
        String[] array = str.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < array.length;i++) {
            String key = array[i];
            if (map.containsKey(key)) {
                Integer value = map.get(key);
                map.remove(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }

        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key + " : " + map.get(key) + " lần.\n");
        }
    }
}
