public class Sill extends Window implements Openable, Closeable, Sillable {
    public Sill(int size) {
        super(size);
    }

    @Override
    public void open() {
        System.out.println("Окно открыто");
    }

    @Override
    public void close() {
        System.out.println("Окно закрыто");

    }

    @Override
    public int getActualSize() {
        return this.getSize() + 5;
    }

    @Override
    public void leanOn(Person person) {
        if(person instanceof Tubik) {
            if (!((Tubik) person).isChilling()) {
                System.out.println(person.getName() + " отдохнул у подоконника");
                ((Tubik) person).setChillingState(true);
            }
        }

    }

    @Override
    public void leanOff(Person person) {
        if (person instanceof Tubik) {
            if(((Tubik) person).isChilling()) {
                System.out.println(person.getName() + " отошел от подоконника");
                ((Tubik) person).setChillingState(false);
            }
        }
    }

    @Override
    public String toString() {
        return "Sill{}" + super.toString();
    }
}
