import java.util.Objects;

public class PersonWithBrokenReflexive {

    private String name;

    public PersonWithBrokenReflexive(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this != o)
            return true;
       return false;
    }


}
