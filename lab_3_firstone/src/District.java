import java.util.ArrayList;

public class District {
    private ArrayList<House> houses;
    private ArrayList<Person> babes;
    private String name;
    District(String name) {
        this.name = name;
        houses = new ArrayList<>();
    }

    public void addHouse(House house) {
        this.houses.add(house);
    }

    public House getHouse(int id) {
        return this.houses.get(id);
    }

    public ArrayList<Person> getBabes() {
        return babes;
    }

    public void setNumOfBabes(int num) {
        babes = new ArrayList<>();
        for(int i = 0; i < num; i++) {
            babes.add(new Person("Малышка " + i, "Красивые волосы"));
        }
    }

    public void displayBabes() {
        class BabePhrase {
            private String phrase;
            public BabePhrase(String phrase) {
                this.phrase = phrase;
            }
            public void sayPhrase() {
                System.out.println(phrase);
            }
        }
        System.out.println(getBabes().size());
        BabePhrase phrase = new BabePhrase("Привет, как дела?...");
        phrase.sayPhrase();

    }
}
