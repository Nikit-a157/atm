import java.time.LocalDateTime;

public class Location {

    String country;
    String zipcode;
    String state;
    String city;
    String address;
    String zone;

    public Location(String country, String zipcode,String state,String city,String address,String zone) {
        this.country = country;
        this.zipcode = zipcode;
        this.state = state;
        this.city = city;
        this.address = address;
        this.zone = zone;

    }
    // getter

    public String getCountry() {
        return this.country;
    }
    public String getZipcode() {
        return this.zipcode;
    }
    public String getState() {
        return this.state;
    }
    public String getCity() {
        return this.city;
    }
    public String getAddress() {
        return this.address;
    }
    public String getZone() {
        return this.zone;
    }
}
