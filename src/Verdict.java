public enum Verdict {
    SUCESS("sucess"),
    FAILURE("failure"),
    OUT_OF_MONEY("out of money"),
    SOFTWARE_ERROR("software error"),
    HARDWARE_ERROR("hardware error"),
    MAX_LIMIT("exceed maximum withdraw limit");

    private String val;
    Verdict(String val) {
        this.val = val;
    }

    public String getVal() {
        return this.val;
    }

}
