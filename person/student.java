// package person;

public class student extends person {
    private String code;
    public student(String code, String name , String add) {
        super(name, add);
        this.code = code;
    }
    @Override
    public String toString() {
        return code + " " + name + " " + add;
    }
}
