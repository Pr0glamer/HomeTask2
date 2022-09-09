import java.util.Objects;

public class BrokenHashcode {

    private String name;

    public BrokenHashcode(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrokenHashcode that = (BrokenHashcode) o;
        return Objects.equals(name, that.name);
    }


}
