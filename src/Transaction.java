import java.time.*;

public class Transaction {
    private long transctionId;
    private LocalDateTime dateOfTransaction;
    private int transactionAmount;
    private Verdict verdict;
    private TransactionType transactionType;
    private Location location;

    public Transaction(long transactionId, LocalDateTime dateOfTransaction, int transactionAmount,
     Verdict verdict, TransactionType transactionType, Location location) {
        this.dateOfTransaction = dateOfTransaction;
        this.location = location;
        this.transactionAmount = transactionAmount;
        this.transactionType = transactionType;
        this.verdict = verdict;
        this.transctionId = transactionId;
    }

    public long getTransactionId() {
        return this.transctionId;
    }

    public LocalDateTime getDateOfTransaction() {
        return this.dateOfTransaction;
    }

    public int getTransactionAmount() {
        return this.transactionAmount;
    }

    public Verdict getVerdict() {
        return this.verdict;
    }

    public TransactionType getTransactionType() {
        return this.transactionType;
    }

    public Location getLocation() {
        return this.location;
    }


    /*public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }
    public void setDateOftransaction(LocalDateTime dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }
    public void setTraansactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
    public void setVerdict(Verdict verdict) {
        this.verdict = verdict;
    }
    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
    public void setLocation(Location location) {
        this.location = location;
    }*/


}
