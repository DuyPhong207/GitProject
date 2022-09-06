package Model;

import java.util.Objects;

public class Product {
    public Product(int id) {
        this.id = id;
    }

    private int id;
    private String name;
    private int price;

    public Product(String name) {

    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product() {

    }

    public Product(int code, String name, int price) {
        this.id = code;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }
}
