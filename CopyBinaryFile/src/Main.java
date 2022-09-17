import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream is = null;
        FileOutputStream os = null;
        try {
            is = new FileInputStream(new File("D:\\CODEGYM\\module 2\\CopyBinaryFile\\src\\source.data"));
            os = new FileOutputStream(new File("D:\\CODEGYM\\module 2\\CopyBinaryFile\\src\\target.data"));
            int length;
            int totalByte = 0;
            byte[] buffer = new byte[1024];
            while (((length = is.read(buffer))) > 0) {
                os.write(buffer, 0, length);
                totalByte += length;
            }
            System.out.println("Copy file complete!");
            System.out.println("Total byte in file: " + totalByte);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            is.close();
            os.close();
        }
    }
}
