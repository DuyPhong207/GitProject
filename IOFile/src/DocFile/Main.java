package DocFile;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\CODEGYM\\module 2\\IOFile\\src\\DocFile\\Countries.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        while ((line = br.readLine()) != null ) {
                readLine(line);
        }
    }
    public static void readLine(String lineCsv) {
        List<String> countryList = new ArrayList<>();
            String[] arr = lineCsv.split(",");
            System.out.println("Country: " + arr[2]);
    }
}
