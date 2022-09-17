package CopyFile;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source file: ");
        String sourcePath = sc.nextLine();
        FileReader fileReader = new FileReader(new File(sourcePath));
        BufferedReader br = new BufferedReader(fileReader);
        System.out.println("Enter target file: ");
        String targetPath = sc.nextLine();
        FileWriter fileWriter = new FileWriter(new File(targetPath));
        BufferedWriter bw = new BufferedWriter(fileWriter);
        String line;
        int sumChar = 0;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            sumChar += line.length();
        }
        br.close();
        bw.close();
        System.out.println("Copy complete!");
        System.out.println("Total character: " + sumChar);
    }
}
