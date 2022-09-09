package Model;

import java.util.prefs.Preferences;

public class Lecturer extends Person {
    private String level;

    public Lecturer() {

    }

    public Lecturer(int code, String name, String dateOfBirth, String gender, String level) {
        super(code, name, dateOfBirth, gender);
        this.level = level;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Lecturer{" +
                "level='" + level + '\'' +
                '}';
    }

    public Lecturer(int code) {
        this.getCode();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
