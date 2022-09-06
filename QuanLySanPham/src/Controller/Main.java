package Controller;

import Service.IProductService;
import Service.Impl.ProductService;

import java.util.Scanner;

public class Main {
    private static IProductService productService = new ProductService();
    private static Scanner sc = new Scanner(System.in);
    private static int choice;
    public static void main(String[] args) {
        while (true) {
            System.out.println(
                    "----MENU QUẢN LÝ SẢN PHẨM----\n" +
                            "1. Thêm sản phẩm\n" +
                            "2. Sửa thông tin sản phẩm\n" +
                            "3. Xoá sản phẩm\n" +
                            "4. Hiển thị danh sách sản phẩm\n" +
                            "5. Tìm kiếm sản phẩm\n" +
                            "6. Sắp xếp sản phẩm tăng dần theo giá\n" +
                            "7. Sắp xếp sản phẩm giảm dần theo giá\n" +
                            "8. Thoát chương trình.");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    productService.editProduct();
                    break;
                case 3:
                    productService.removeProduct();
                    break;
                case 4:
                    productService.showList();
                    break;
                case 5:
                    productService.searchProduct();
                    break;
                case 6:
                    productService.sortRaisePrice();
                    break;
                case 7:
                    productService.sortReducePrice();
                    break;
                case 8:
                    System.exit(0);
            }
        }
    }
}
