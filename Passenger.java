package FlightReservation;

public class Passenger extends Contact {
    private static int idCounter;
    private int id;

    public Passenger(String name, long phoneNumber, String emailId) {
        super(name, phoneNumber, emailId);


        this.id = idCounter;
        idCounter++;
    }
    public int getId() {
        return idCounter;
    }
}