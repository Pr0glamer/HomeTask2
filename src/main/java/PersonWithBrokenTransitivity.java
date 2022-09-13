import java.util.Objects;

public class PersonWithBrokenTransitivity {
    private String name;

    public PersonWithBrokenTransitivity(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof PersonWithBrokenTransitivity)) return false;
        PersonWithBrokenTransitivity that = (PersonWithBrokenTransitivity) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class PersonWithBrokenTransitivityChild extends PersonWithBrokenTransitivity {
    private String surname;

    public PersonWithBrokenTransitivityChild(String name, String surname) {
        super(name);
        this.surname = surname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PersonWithBrokenTransitivityChild that = (PersonWithBrokenTransitivityChild) o;
        return Objects.equals(surname, that.surname);
    }


}