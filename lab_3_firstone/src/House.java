import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class House {
    public static int a = 1;
    private String name;
    private int numOfFlats;
    private Flat[] flats;
    public House(String name, int numOfFlats) {
        this.name = name;
        this.numOfFlats = numOfFlats;
        this.flats = new Flat[numOfFlats];
        for(int i = 1; i <= numOfFlats; i++) {
            if(Math.random() > 0.5)
                this.flats[i - 1] = new Flat(i, 2, TypeOfAFlat.ORDINARY, new ArrayList<Person>(), this);
            else
                this.flats[i - 1] = new Flat(i, 2, TypeOfAFlat.STUDIO, new ArrayList<Person>(), this);

        }
    }
    public Flat getFlat(int id) {
        return flats[id];
    }
    // (access modifier) (staticness property) (return type) (name of the method)

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return numOfFlats  == house.numOfFlats && name.equals(house.name) && Arrays.equals(flats, house.flats);
    }

    @Override
    public int hashCode() {
        class AddHash {

        }
        int result = Objects.hash(name, numOfFlats, new AddHash());
        result = 31 * result;
        return result;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", numOfFlats=" + numOfFlats +
                '}';
    }

    public class ParkingLot {
        int size;
        public ParkingLot(int size) {
            this.size = size;
        }

        public int getSize() {
            return size;
        }
    }

    public static class JKHRuler {
        private String name;

        public JKHRuler(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
