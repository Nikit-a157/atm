public class CurrencyComposition {
    int fiveHundered;
    int twoHundered;
    int oneHundered;
    int fifty;
    int ten;

    public CurrencyComposition(int fiveHundered, int twoHundered, int oneHundered,int fifty, int ten) {
        this.fiveHundered = fiveHundered;
        this.twoHundered = twoHundered;
        this.oneHundered  = oneHundered;
        this.fifty = fifty;
        this.ten = ten;
    }

    public int getFiveHundered() {
        return this.fiveHundered;
    }
    public int getTwoHundered() {
        return this.twoHundered;
    }
    public int getOneHundered() {
        return this.oneHundered;
    }
    public int getFifty() {
        return this.fifty;
    }
    public int getTen() {
        return this.ten;
    }

    public void setFiveHundered(int notes) {
        this.fiveHundered = this.fiveHundered - notes;
    }
    public void setTwoHundered(int notes) {
        this.twoHundered = this.twoHundered - notes;
    }
    public void setOneHundered(int notes) {
        this.oneHundered = this.oneHundered - notes;
    }
    public void setFifty(int notes) {
        this.fifty = this.fifty - notes;
    }
    public void setTen(int notes) {
        this.ten = this.ten - notes;
    }
}
