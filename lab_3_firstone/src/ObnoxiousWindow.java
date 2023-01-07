public class ObnoxiousWindow extends Window {
    public ObnoxiousWindow(int size) {
        super(size);
    }

    @Override
    public String toString() {
        return "ObnoxiousWindow{}" + super.toString();
    }

    @Override
    public int getActualSize() {
        return this.getSize();
    }
}
