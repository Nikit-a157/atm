public class User {

    private String userName;
    private int pin;
    private String accountNo;
    private int cvv;
    private double balance;
    private int monthOfExpiry;
    private int yearOfExpiry;

    public User(String userName, int pin, String accountNo,int cvv, double balance, int monthOfExpiry, int yearOfExpiry) {

        this.accountNo = accountNo;
        this.balance = balance;
        this.pin = pin;
        this.userName = userName;
        this.cvv = cvv;
        this.monthOfExpiry = monthOfExpiry;
        this.yearOfExpiry = yearOfExpiry;
    }

    // getting values
    public String getUserName() {
        return this.userName;
    }
    public int getPin() {
        return this.pin;
    }
    public String getAccountNo() {
        return this.accountNo;
    }
    public int getCvv() {
        return this.cvv;
    }
    public int getMonthOfExpiry() {
        return this.monthOfExpiry;
    } 
    public int getyearOfExpiry() {
        return this. yearOfExpiry;
    }
    public double getBalance() {
        return this.balance;
    }

// setting values
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    public void setMonthOfExpiry(int monthOfExpiry) {
        this.monthOfExpiry = monthOfExpiry;
    } 
    public void setyearOfExpiry(int yearOfExpiry) {
        this. yearOfExpiry = yearOfExpiry;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
 
}
