public class Guslya extends Person implements Arguable {


    public Guslya(String name, String hair) {
        super(name, hair);
    }

    @Override
    public void argue(Tubik tubik) throws ArgueNotFeasibleException {
        if (tubik.isChilling() == false) {
                if(Math.random() < 0.5)
                    throw new ArgueNotFeasibleException();
        }
        double c = Math.random();
        if(c<0.4)
            System.out.println(this.getName() + " начинает спорить с " + tubik.getName());
        if(c <0.6)
            System.out.println(tubik.getName() + " расстроился от поступка " + this.getName());
        if(c<0.7)
            System.out.println(this.getName() + " не соглашается с репликой " + tubik.getName());
            System.out.println(tubik.getName() + " осуждает высказывание " + this.getName());
    }


    @Override
    public String toString() {
        return "Guslya{}" + super.toString();
    }
}
