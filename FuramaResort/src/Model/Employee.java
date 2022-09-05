package Model;

import java.sql.Date;

public class Employee extends Person{
    private String level;
    private String local;
    private short pay;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public short getPay() {
        return pay;
    }

    public void setPay(short pay) {
        this.pay = pay;
    }

    public Employee(String id, String name, Date dob, String gender, String cmnd, String phone, String email, String level, String local, short pay) {
        super(id, name, dob, gender, cmnd, phone, email);
        this.level = level;
        this.local = local;
        this.pay = pay;
    }

    @Override
    public String toString() {
        super.toString();
        return "Employee{" +
                "level='" + level + '\'' +
                ", local='" + local + '\'' +
                ", pay=" + pay +
                '}';
    }
}
