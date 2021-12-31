package FlightReservation;

public class Address {
    //    street, city and state
    private String street;
    private String city;
    private String state;

    public Address(String street, String city, String state){
        this.street = street;
        this.city = city;
        this.state = state;
    }
    public String address() {
        return "Address = Street: "+street+", City: "+city+", State: "+state;
    }


}