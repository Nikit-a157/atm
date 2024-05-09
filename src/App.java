public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        MachineFeatures machine = new MachineFeatures();
        Location location = new Location("India","245301", "UTTAR PRADESH", "PILKHUWA", "Ashok nagar","nothing");
        CurrencyComposition composition = new CurrencyComposition(500, 500, 500, 500, 500);
        User user = new User("nikita", 0572, "41270330", 0123, 20000, 07, 24);
        ATM atm = new ATM("1234", location, composition);

        machine.checkUSerBalance(user);
        machine.seeComposition(composition);
        machine.createATM(location, composition);
        composition = new CurrencyComposition(3, 5, 100, 5, 010);
        machine.updateATMCmposition(atm, composition);
        machine.updateATMLocation(atm,location);
        machine.seeComposition(composition);

        machine.withdraw(2000, user, atm);
    }
}
