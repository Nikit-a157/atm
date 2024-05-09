import java.util.*;

public class ATM {

    private String atmId;
    private Location location;
    private CurrencyComposition composition;
    private long balance;
    private Condition condition;
    private List<Transaction> transactionList  = new ArrayList<>();

    public ATM(String atmID, Location location, CurrencyComposition composition) {
        this.composition = composition;
        this.atmId = atmId;
        this.location = location;
        condition = Condition.WORKING;
        this.balance = getBalance(composition);

    }

    public void setLocation(Location location) {
        this.location = location;
    }
    public void setCurrencyComposition(CurrencyComposition composition) {
        this.composition = composition;
    }

    private long getBalance(CurrencyComposition composition) {
        return composition.getFiveHundered()*500 + composition.getTwoHundered()*200 + 
        composition.getOneHundered()*100 + composition.getFifty()*50 + 
        composition.getTen()*10;
    }

    public CurrencyComposition getCurrencyComposition() {
        return this.composition;
    }
    public String getAtmId() {
        return this.atmId;
    }
    public Location getLocation() {
        return this.location;
    }
    public long getBalance() {
        return this.balance;
    }
    public Condition getCondition() {
        return this.condition;
    }

    public List<Transaction> getTransaction() {
        return this.transactionList;
    }

}
