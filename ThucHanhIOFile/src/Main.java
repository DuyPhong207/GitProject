import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("D:\\CODEGYM\\module 2\\ThucHanhIOFile\\src\\List.data");
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("1. Add product to file");
            System.out.println("2. Display products in file");
            System.out.println("3. Exit");
            System.out.println("Enter choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter code: ");
                    int code = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter price: ");
                    int price = Integer.parseInt(sc.nextLine());
                    Product product = new Product(code, name, price);
                    try {
                        oos.writeObject(product);
                        oos.flush();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        oos.close();
                    }
                    System.out.println("Add complete!");
                    break;
                case 2:
                    List<Product> productListIn = new ArrayList<>();
                    try {
                        InputStream is = new FileInputStream(file);
                        ObjectInputStream ois = new ObjectInputStream(is);
                        Product product1 = null;
                        while (true) {
                            product1 = (Product) ois.readObject();
                            if (product1 == null) {
                                break;
                            } else {
                                productListIn.add(product1);
                            }
                        }
                        ois.close();
                    } catch (IOException ex ) {
                        ex.printStackTrace();
                    }
                    for (Product p : productListIn) {
                        System.out.println(p.toString());
                    }
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
