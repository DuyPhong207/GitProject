import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int choice;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
            File file = new File("D:\\CODEGYM\\module 2\\QuanLySanPhamBinaryFile\\ListProduct.data");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            List<Product> productList3 = new ArrayList<>();
            while (true) {
                System.out.println("---------Menu--------");
                System.out.println("1. Add product to file.");
                System.out.println("2. Search product in file.");
                System.out.println("3. Display list product in file.");
                System.out.println("4. Write to file.");
                System.out.println("5. Exit.");
                System.out.println("Enter choice: ");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Enter code: ");
                        int code = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter manufacturer: ");
                        String manufacturer = sc.nextLine();
                        System.out.println("Enter price: ");
                        int price = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter others: ");
                        String other = sc.nextLine();
                        Product product = new Product(code, name, manufacturer, price, other);
                        productList3.add(product);
                        System.out.println("Add complete.");
                        break;
                    case 2:
                        System.out.println("Enter code: ");
                        int codeSearch = Integer.parseInt(sc.nextLine());
                        Product productSearch = new Product(codeSearch);
                        InputStream is = new FileInputStream(file);
                        ObjectInputStream ois = new ObjectInputStream(is);
                        Product pr = null;
                        List<Product> productList = new ArrayList<>();
                        while (true) {
                            Object oj = ois.readObject();
                            if (oj != null) {
                                pr = (Product) oj;
                                productList.add(pr);
                            } else {
                                break;
                            }
                        }
                        ois.close();
                        int index = productList.indexOf(productSearch);
                        System.out.println(productList.get(index));
                        break;
                    case 3:
                        InputStream is2 = new FileInputStream(file);
                        ObjectInputStream ois2 = new ObjectInputStream(is2);
                        List<Product> productList1 = new ArrayList<>();
                        productList1 = (List<Product>) ois2.readObject();
                        ois2.close();
                        for (Product p : productList1) {
                            System.out.println(p.toString());
                        }
                        break;
                    case 4:
                        oos.writeObject(productList3);
                        oos.flush();
                        oos.close();
                        productList3.clear();
                        break;
                    case 5:
                        System.exit(0);
                }
            }
    }
}
