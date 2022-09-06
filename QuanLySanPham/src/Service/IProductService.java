package Service;

import Model.Product;

public interface IProductService {

    void addProduct();

    void showList();

    boolean checkProduct(Product product);

    void editProduct();

    void removeProduct();

    void searchProduct();

    void sortReducePrice();

    void sortRaisePrice();
}
