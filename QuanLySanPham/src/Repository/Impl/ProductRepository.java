package Repository.Impl;

import Model.Product;
import Repository.IProductRepository;

import java.util.*;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();
    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }
    @Override
    public List<Product> showList() {
        return productList;
    }

    @Override
    public void editProduct(int index, Product newProduct) {
        productList.set(index, newProduct);
    }

    @Override
    public void removeProduct(Product product) {
        productList.remove(product);
    }

    @Override
    public void searchProduct(int index) {
        productList.get(index);
    }

    @Override
    public boolean checkProduct(Product product) {
        return productList.contains(product);
    }

    @Override
    public int checkIndexProduct(Product product) {
        return productList.indexOf(product);
    }

    @Override
    public void sortReducePrice() {
        Collections.sort(productList, (o1, o2) -> {
            if (o1.getPrice() < o2.getPrice()) {
                return 1;
            } else if (o1.getPrice() > o2.getPrice()) {
                return -1;
            } else {
                return 0;
            }
        });
    }
    @Override
    public void sortRaisePrice() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }
}
