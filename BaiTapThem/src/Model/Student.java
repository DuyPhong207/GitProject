package Model;

public class Student extends Person {
    private String className;
    private float score;

    public Student() {

    }

    public Student(int code, String name, String dateOfBirth, String gender, String className, float score) {
        super(code, name, dateOfBirth, gender);
        this.className = className;
        this.score = score;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "Student{" +
                "className='" + className + '\'' +
                ", score=" + score +
                '}';
    }

    public Student(int code) {
        this.getCode();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
