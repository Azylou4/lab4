import java.util.Objects;

public class Tubik extends Person{


    private boolean sillState;
    public Tubik(String name, String hair) {
        super(name, hair);
    }
    public void chillOnASill(Sill sill) {
        sill.leanOn(this);
    }
    public void stopChillingOnASill(Sill sill)  {
        sill.leanOff(this);
    }
    public void setChillingState(boolean is) {
        sillState = is;
    }
    public boolean isChilling() {
        return sillState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tubik tubik = (Tubik) o;
        return sillState == tubik.sillState;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sillState);
    }

    @Override
    public String toString() {
        return "Tubik{" +
                "sillState=" + sillState +
                '}' + super.toString();
    }
}
