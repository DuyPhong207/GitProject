package Model;

import java.sql.Date;

public class Lecturer extends Person {
    private String level;

    public Lecturer(int id, String name, String gender, String dob, String level) {
        super(id, name, gender, dob);
        this.level = level;
    }

    public Lecturer() {

    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        super.toString();
        return "Lecturer{" +
                "level='" + level + '\'' +
                '}';
    }

}
