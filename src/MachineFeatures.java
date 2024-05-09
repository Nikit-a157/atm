import java.time.LocalDateTime;

public class MachineFeatures {

    public  ATM createATM(Location location, CurrencyComposition composition) {
        return new ATM("NIKI123", location, composition);
    }

    public void updateATMLocation(ATM atm, Location location) {
        atm.setLocation(location);
    }

    public void updateATMCmposition(ATM atm,CurrencyComposition composition) {
        atm.setCurrencyComposition(composition);
    }

    public void seeComposition(CurrencyComposition composition) {
        System.out.println("ATM Composition: " );

        System.out.println("1. 500 Notes: " + composition.getFiveHundered());
        System.out.println("1. 200 Notes: " + composition.getTwoHundered());
        System.out.println("1. 100 Notes: " + composition.getOneHundered());
        System.out.println("1. 50 Notes: " + composition.getFifty());
        System.out.println("1. 10 Notes: " + composition.getTen());
        System.out.println("________________________________________: " );
    }

    public void checkUSerBalance(User user) {
        System.out.println("your Balance is: "+ user.getBalance());
    }

    public void  withdraw(int amount, User user,ATM atm) {
        if(amount > user.getBalance()) {
            Transaction transaction = new  Transaction(12334L, LocalDateTime.now(), amount,Verdict.FAILURE, TransactionType.FAILED, atm.getLocation());
            atm.getTransaction().add(transaction);
            System.out.println("IN sufficient funds");
            return;
        }
        if(amount > atm.getBalance()) {
            Transaction transaction = new Transaction(12335L, LocalDateTime.now(), amount, Verdict.OUT_OF_MONEY, TransactionType.FAILED, atm.getLocation());
            atm.getTransaction().add(transaction);
            System.out.println("Sorry we are out of Funds");
            return;
        }

        Transaction transaction = new Transaction(12336L, LocalDateTime.now(), amount, Verdict.SUCESS, TransactionType.DEBIT, atm.getLocation());

        atm.getTransaction().add(transaction);
        updateCompositionNotes(atm, amount);
        System.out.println("Account is debited with " + amount);
        user.setBalance(user.getBalance() - amount);
        checkUSerBalance(user);
    }

    private void updateCompositionNotes(ATM atm, int amount) {
        
        CurrencyComposition composition  =  atm.getCurrencyComposition();
        int fiveHundered = amount/500;
        if(composition.getFiveHundered() >= fiveHundered ) {
            amount = amount - fiveHundered*500;
            composition.setFiveHundered(fiveHundered);
        }
        int twoHundered = amount/200;
        if(composition.getTwoHundered() >= twoHundered ) {
            amount = amount - twoHundered*200;
            composition.setTwoHundered(twoHundered);
        }
        int oneHundered = amount/100;
        if(composition.getOneHundered() >= oneHundered ) {
            amount = amount - oneHundered*100;
            composition.setOneHundered(oneHundered);
        }
        int fifty = amount/50;
        if(composition.getFifty() >= fifty ) {
            amount = amount - fifty*50;
            composition.setFifty(fifty);
        }
        int ten = amount/10;
        if(composition.getTen() >= ten) {
            amount = amount - ten*10;
            composition.setTen(ten);
        }


        updateATMCmposition(atm, composition);
        seeComposition(composition);
    }

}
