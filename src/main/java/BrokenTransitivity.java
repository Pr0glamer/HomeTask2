import java.util.Objects;

public class BrokenTransitivity {
    private String name;

    public BrokenTransitivity(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof BrokenTransitivity)) return false;
        BrokenTransitivity that = (BrokenTransitivity) o;
        return Objects.equals(name, that.name);
    }


}

class BrokenTransitivityChild extends BrokenTransitivity{
    private String surname;

    public BrokenTransitivityChild(String name, String surname) {
        super(name);
        this.surname = surname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BrokenTransitivityChild that = (BrokenTransitivityChild) o;
        return Objects.equals(surname, that.surname);
    }


}