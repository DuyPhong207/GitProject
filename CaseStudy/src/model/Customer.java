package model;

import java.sql.Date;

public class Customer extends Person{
    private String type;
    private String address;

    public Customer(int id, String name, String dob, String gender, int cmnd, String phone, String email, String type, String address) {
        super(id, name, dob, gender, cmnd, phone, email);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        super.toString();
        return "Customer{" +
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
