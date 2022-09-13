import java.util.Objects;

public class PersonWithBrokenSymmetry {
    private String name;

    public PersonWithBrokenSymmetry(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if(o instanceof String) {
            return name.equals(o);
        }

        return false;

    }

}
