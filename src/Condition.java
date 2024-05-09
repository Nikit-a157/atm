public enum Condition {
    WORKING("working"),
    TECHNICAL_ERROR("technical error"),
    OUT_OF_BALANCE("out of balance"),
    ABANDONED("abandoned");

    private String val; 
    
    Condition(String val) {
        this.val = val;
    }
    public String getval() {
        return this.val;
    }

}
