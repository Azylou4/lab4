import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Flat {
    private int id;
    private int numOfRooms;
    private Room[] rooms;
    private TypeOfAFlat typeOfAFlat;
    private ArrayList<Person> inhabitants;
    private House masterHouse;


    public Flat(int id, int numOfRooms,TypeOfAFlat typeOfAFlat, ArrayList<Person> inhabitants, House masterHouse) {
        this.id = id;
        this.typeOfAFlat = typeOfAFlat;
        this.numOfRooms = numOfRooms;
        this.inhabitants = inhabitants;
        this.masterHouse = masterHouse;
        this.rooms = new Room[numOfRooms];
        for (int i = 0; i < numOfRooms; i++) {
            rooms[i] = new Room(new ObnoxiousWindow(5),20);
        }
        rooms[numOfRooms-1] = new Room(new Sill(20), 35);
    }
    public void  setInhabitant(Person person) {
        inhabitants.add(person);
    }
    public Person getInhabitant(String name)  {
        for(int i = 0; i< inhabitants.size(); i++) {
            if(inhabitants.get(i).getName().equals(name))
                return inhabitants.get(i);
        }
        return null;
    }
    public Sill findASill() {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getWindow() instanceof Sill) {
                return (Sill) rooms[i].getWindow();
            }

        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flat flat = (Flat) o;
        return id == flat.id && numOfRooms == flat.numOfRooms && Arrays.equals(rooms, flat.rooms) && typeOfAFlat == flat.typeOfAFlat && inhabitants.equals(flat.inhabitants) && masterHouse.equals(flat.masterHouse);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, numOfRooms, typeOfAFlat, inhabitants, masterHouse);
        result = 31 * result + Arrays.hashCode(rooms);
        return result;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "id=" + id +
                ", numOfRooms=" + numOfRooms +
                ", typeOfAFlat=" + typeOfAFlat +
                ", inhabitants=" + inhabitants +
                ", masterHouse=" + masterHouse +
                '}';
    }
}
