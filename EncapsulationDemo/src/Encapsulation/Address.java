package Encapsulation;

public class Address {

    private Integer pinCode;

    private String country;

    private String state;

    private String street;

    public Address() {
    }

    public Address(Integer pinCode, String country, String state, String street) {
        this.pinCode = pinCode;
        this.country = country;
        this.state = state;
        this.street = street;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address [country=" + country + ", pinCode=" + pinCode + ", state=" + state + ", street=" + street + "]";
    }
    
    
}
