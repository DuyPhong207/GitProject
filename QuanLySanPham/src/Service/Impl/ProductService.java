package Service.Impl;

import Model.Product;
import Repository.IProductRepository;
import Repository.Impl.ProductRepository;
import Service.IProductService;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private IProductRepository iProductRepository = new ProductRepository();
    private Scanner sc = new Scanner(System.in);

    public Product infoProduct() {
        System.out.println("Nhập id sản phẩm");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String name = sc.nextLine();
        System.out.println("Nhập giá sản phẩm");
        int price = Integer.parseInt(sc.nextLine());
        Product product = new Product(id, name, price);
        return product;
    }
    @Override
    public void addProduct() {
        Product product = this.infoProduct();
        iProductRepository.addProduct(product);
    }
    @Override
    public void showList() {
        List<Product> productList = iProductRepository.showList();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public boolean checkProduct(Product product) {
        return iProductRepository.checkProduct(product);
    }

    @Override
    public void editProduct() {
        System.out.println("Nhập id sản phẩm cần sửa thông tin");
        int id = Integer.parseInt(sc.nextLine());
        Product product = new Product(id);
        if (checkProduct(product)) {
            Product newProduct = this.infoProduct();
            int index = iProductRepository.checkIndexProduct(product);
            iProductRepository.editProduct(index , newProduct);
        } else {
            System.out.println("Sản phẩm không tồn tại");
        }
    }

    @Override
    public void removeProduct() {
        System.out.println("Nhập id sản phẩm cần xóa");
        int id = Integer.parseInt(sc.nextLine());
        Product product = new Product(id);
        iProductRepository.removeProduct(product);
    }

    @Override
    public void searchProduct() {
        System.out.println("Nhập id sản phẩm cần tìm");
        String name = sc.nextLine();
        Product product = new Product(name);
        if (checkProduct(product)) {
            int index = iProductRepository.checkIndexProduct(product);
            iProductRepository.searchProduct(index);
        } else {
            System.out.println("Sản phẩm không tồn tại");
        }
    }

    @Override
    public void sortReducePrice() {
        iProductRepository.sortReducePrice();
        showList();
    }

    @Override
    public  void sortRaisePrice() {
        iProductRepository.sortRaisePrice();
        showList();
    }
}
