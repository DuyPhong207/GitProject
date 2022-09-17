package DocFile;

public class Country {
    private String number;
    private String code;
    private String name;

    public Country(String number, String code, String name) {
        this.number = number;
        this.code = code;
        this.name = name;
    }

    public String  getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "number=" + number +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
