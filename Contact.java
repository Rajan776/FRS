package FlightReservation;

public class Contact {
    //  name, phone number and email ID
    private String name;
    private long phoneNumber;
    private String emailId;

    public Contact(String name, long phoneNumber, String emailId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    public String contact() {
        return "Contact = Name : " +name+ ", Phone No : "+phoneNumber+", Email Id : "+emailId;
    }

}