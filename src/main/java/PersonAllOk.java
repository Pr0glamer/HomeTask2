import java.util.Objects;

public class PersonAllOk {
    private String name;

    public PersonAllOk(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonAllOk personAllOk = (PersonAllOk) o;
        return Objects.equals(name, personAllOk.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
