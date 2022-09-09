import java.util.Objects;

public class AllBroken {
    private String name;

    public static void main(String[] args) {
        System.out.println("123");
    }

    public AllBroken(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllBroken allBroken = (AllBroken) o;
        return Objects.equals(name, allBroken.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
