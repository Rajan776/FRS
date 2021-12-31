package FlightReservation;
import java.time.LocalDateTime;

public class Flight {
//    flight number, the airline of the flight, the capacity of that flight and the number of seats booked.
//    get the flight details and check the availability of seats.
//    departure and destination locations,
//    the flight on which the seat is booked, the date and time of departure and arrival,


    public int flightNumber;
    public String flightName;
    public int capacity;
    public int reservation;
    public String departureLocation;
    public String destinationLocation;
    public LocalDateTime departureDateTime;
    public LocalDateTime arrivalDateTime;


    public Flight(int flightNumber, String flightName, int capacity, int reservation, String departureLocation,
                  String destinationLocation, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime){
        this.flightNumber = flightNumber;
        this.flightName = flightName;
        this.capacity = capacity;
        this.reservation = reservation;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;

    }

    public String flight() {
        return "Flight No : "+flightNumber+", Flight Name : "+flightName+", Total number of seats : "+capacity+
                ", No of seats Booked : "+reservation+", No of seats available : "+(capacity - reservation)+"," +
                " DepartureLocation : "+departureLocation+ ", DestinationLocation : "+destinationLocation+
                ", Departure Date & Time : "+departureDateTime+", Arrival Date & Time : "+arrivalDateTime;
    }
}