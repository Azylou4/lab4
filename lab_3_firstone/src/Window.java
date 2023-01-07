import java.util.Objects;

public abstract class Window{
    private int size;
    public Window(int size) {
        this.size = size;

    }

    public int getSize() {
        return size;
    }

    public abstract int getActualSize();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return size == window.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }


    @Override
    public String toString() {
        return "Window{" +
                "size=" + size +
                '}';
    }
}
