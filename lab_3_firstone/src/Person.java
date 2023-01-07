import com.sun.source.tree.InstanceOfTree;

import java.util.Objects;

public class Person {
    private String name;
    private String hair;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHair() {
        return hair;
    }
    public void spit(Person person) throws SpitException {
        if ((this instanceof Tubik) || (person instanceof Tubik)) {
            if(Math.random() < 0.8) {
                throw new SpitException();
            }
        }
        System.out.println(this.name + "и" + person.name + " плюют из окна" );

    }
    public void setHair(String hair) {
        this.hair = hair;
    }

    public Person(String name, String hair) {
        this.name = name;
        this.hair = hair;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && hair.equals(person.hair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hair);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", hair='" + hair + '\'' +
                '}';
    }
}
