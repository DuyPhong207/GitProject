package Model;

import java.sql.Date;

public class Student extends Person {
    private String clas;
    private float score;

    public Student(int id, String name, String gender, String dob, String clas, float score) {
        super(id, name, gender, dob);
        this.clas = clas;
        this.score = score;
    }

    public Student() {

    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        super.toString();
        return "Student{" +
                "clas='" + clas + '\'' +
                ", score=" + score +
                '}';
    }
}
