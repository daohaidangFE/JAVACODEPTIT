// package person;
import java.security.Permission;

public class person {
    protected String name, add;

    public person(String name, String add) {
        this.name = name;
        this.add = add;
    }
    @Override
    public String toString() {
        return name + " " + add;
    }
}

