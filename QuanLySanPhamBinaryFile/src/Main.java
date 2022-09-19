import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int choice;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("D:\\CODEGYM\\module 2\\QuanLySanPhamBinaryFile\\ListProduct.data");
        while (true) {
                System.out.println("---------Menu--------");
                System.out.println("1. Add product to file.");
                System.out.println("2. Search product in file.");
                System.out.println("3. Display list product in file.");
                System.out.println("4. Exit.");
                System.out.println("Enter choice: ");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        try {
                            ArrayList<Product> productListOut = new ArrayList<>();
                            if (file.length() != 0) {
                                InputStream is1 = new FileInputStream(file);
                                ObjectInputStream ois1 = new ObjectInputStream(is1);
                                productListOut = (ArrayList<Product>) ois1.readObject();
                                ois1.close();
                            }
                            OutputStream os = new FileOutputStream(file);
                            ObjectOutputStream oos = new ObjectOutputStream(os);
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
                            productListOut.add(product);
                            try {
                                oos.writeObject(productListOut);
                                productListOut.clear();
                                oos.flush();
                            } catch (IOException ex) {
                                ex.printStackTrace();
                                oos.close();
                            }
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        System.out.println("Add complete!");
                        break;
                    case 2:
                        System.out.println("Enter code: ");
                        int codeSearch = Integer.parseInt(sc.nextLine());
                        List<Product> productListSearch = new ArrayList<>();
                        Product productSearch = new Product(codeSearch);
                        try {
                            InputStream is = new FileInputStream(file);
                            ObjectInputStream ois = new ObjectInputStream(is);
                            productListSearch = (List<Product>) ois.readObject();
//                            Product product2 = null;
//                            while (true) {
//                                product2 = (Product) ois.readObject();
//                                if (product2 == null) {
//                                    break;
//                                } else {
//                                    productListSearch.add(product2);
//                                }
//                            }
                            ois.close();
                        } catch (IOException ex ) {
                            ex.printStackTrace();
                        }
                        int index = productListSearch.indexOf(productSearch);
                        if (index == -1) {
                            System.out.println("Not found");
                        } else {
                            System.out.println(productListSearch.get(index));
                        }
                        break;
                    case 3:
                        ArrayList<Product> productListIn = new ArrayList<>();
                        try{
                            InputStream is = new FileInputStream(file);
                            ObjectInputStream ois = new ObjectInputStream(is);
                            productListIn = (ArrayList<Product>) ois.readObject();

//                            while (true) {
//                                product1 = (Product) ois.readObject();
//                                if (product1 == null) {
//                                    break;
//                                } else {
//                                    productListIn.add(product1);
//                                }
//                            }
                            ois.close();
                        } catch (IOException ex ) {
                            ex.printStackTrace();
                        }
                        for (Product p : productListIn) {
                            System.out.println(p.toString());
                        }
                        break;
                    case 4:
                        System.exit(0);
                }
            }
    }
}
