import java.util.ArrayList;
import java.util.Objects;

public class Room {

    private Window window;
    private int size;
    public Room(Window window, int size) {
        this.size = size;
        this.window = window;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return size == room.size && window.equals(room.window);
    }

    @Override
    public int hashCode() {
        return Objects.hash(window, size);
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Room{" +
                "window=" + window +
                ", size=" + size +
                '}';
    }
}
