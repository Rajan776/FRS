package FlightReservation;

public class Ticket {
//    For each ticket, we should be able to keep track of the PNR number,
//    the details of the passenger who booked the ticket, the seat number,
//    the price of the ticket and whether that ticket is cancelled or not. For each ticket,
//    we should be able to check its status (either ‘Confirmed’ or ‘Cancelled’),
//    the duration of the journey, and we should also be able to cancel the ticket.

    public long PNRNumber;
    public int seatNumber;
    public double price;
    public String status;

    public Ticket(long PNRNumber, int seatNumber, double price, String status) {
        this.PNRNumber = PNRNumber;
        this.seatNumber = seatNumber;
        this.price = price;
        this.status = status;
    }
    public String ticket() {
        return"PNR Number : "+PNRNumber+", Seat Number : "+seatNumber+", Price : "+price+", Status : "+status;
    }

}