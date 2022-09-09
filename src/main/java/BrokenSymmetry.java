import java.util.Objects;

public class BrokenSymmetry {
    private String name;

    public BrokenSymmetry(String name) {
        this.name = name;
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
