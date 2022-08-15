package LopChiGhi;

public class Student {
    private String name = "John";
    private String $class = "C02";

    public Student() {

    }

    public Student(String name, String $class) {
        this.name = name;
        this.$class = $class;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void set$class(String $class) {
        this.$class = $class;
    }

    public static void main(String[] args) {
        String name = "Trinh Duy Phong";
        String $class = "A0522I1";
        Student newStudent = new Student(name,$class);
        newStudent.setName(name);
        newStudent.set$class($class);
    }
}
