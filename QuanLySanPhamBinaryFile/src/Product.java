import java.io.Serializable;

public class Product implements Serializable {
    private int code;
    private String name;
    private String manufacturer;
    private int price;
    private String others;

    public Product(int code, String name, String manufacturer, int price, String others) {
        this.code = code;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.others = others;
    }

    public Product(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return code == product.code;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", others='" + others + '\'' +
                '}';
    }
}
