import java.util.Objects;

public class AllOk {
    private String name;

    public AllOk(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllOk allOk = (AllOk) o;
        return Objects.equals(name, allOk.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
