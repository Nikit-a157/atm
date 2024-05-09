public enum TransactionType {
    CREDIT("credit"),
    DEBIT("debit"),
    FAILED("failed");

    private String val;

    TransactionType(String val) {
        this.val = val;
    }

    public String getVal() {
        return this.val;
    }
}
