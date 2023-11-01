public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;


    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }
    public void setStreet() {
        this.street = street;
    }

    public void setCity() {
        this.city = city;
    }

    public void setState() {
        this.state = state;
    }

    public void setZipCode() {
        this.zipCode = zipCode;
    }

    public String toString() {
        return "Address{street='" + street + "', city='" + city + "', state='" + state + "', zipCode='" + zipCode + "'}";
    }

}
