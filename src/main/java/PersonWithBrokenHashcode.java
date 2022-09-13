import java.util.Objects;

public class PersonWithBrokenHashcode {

    private String name;

    public PersonWithBrokenHashcode(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonWithBrokenHashcode that = (PersonWithBrokenHashcode) o;
        return Objects.equals(name, that.name);
    }


}
