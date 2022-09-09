package Repository;

import Model.Product;

import java.util.List;

public interface IProductRepository {

    void addProduct(Product product);

    List<Product> showList();

    void editProduct(int index, Product newProduct);

    void removeProduct(Product product);

    void searchProduct(String name);
    boolean checkProduct(Product product);

    int checkIndexProduct(Product product);

    void sortReducePrice();

    void sortRaisePrice();
}
