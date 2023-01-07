public class Main {
    public static void main(String[] args) {
        District appleDistrict = new District("YAB DIS") {
            @Override
            public void displayBabes() {
                System.out.println(getBabes().size() + " малышек уже пришли");
            }
        };
        House house = new House("MainHouse", 2);
        appleDistrict.addHouse(house);
        appleDistrict.setNumOfBabes(10);
        House.ParkingLot parkingLot = house.new ParkingLot(5);
        House.JKHRuler ruler = new House.JKHRuler("Semen Andreevich");
        appleDistrict.displayBabes();
        Flat ourFlat = house.getFlat(1);
        Tubik tubik = new Tubik("Тюбик", "взъерошенная шевелюра");
        Guslya guslya = new Guslya("Гусля", "аккуратно причесанная голова");
        ourFlat.setInhabitant(tubik);
        Sill sill = ourFlat.findASill();
        if (sill == null)
            System.out.println("Не смогли найти подоконник...");
        else {
            tubik.chillOnASill(sill);
            tubik.stopChillingOnASill(sill);
        }

        try {
            guslya.argue(tubik);
        } catch (ArgueNotFeasibleException e) {
            System.out.println(e.getMessage());
        }

        guslya.spit(tubik);
    }
}
