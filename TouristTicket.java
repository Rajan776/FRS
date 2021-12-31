package FlightReservation;


import java.util.Iterator;
import java.util.List;

public class TouristTicket extends Ticket{
//    For tourist tickets, we should be able to keep track of the hotel address and the selected tourist
//    locations by the passenger. A passenger can select a maximum of five tourist locations.
//    We should also be able to add or remove tourist locations if required.

    public static final int MAX_NO_LOCATIONS = 5;
    private String hotelAddress;
    private List<String> touristLocationsList;



    public TouristTicket(String hotelAddress, long PNRNumber, int seatNumber, double price, String status,
                         List <String> touristLocationsList) {
        super(PNRNumber, seatNumber, price, status);
        this.hotelAddress = hotelAddress;

        this.touristLocationsList = touristLocationsList;
    }

    public List<String> getTouristLocations() {
        return touristLocationsList;
    }

//     touristLocation
//     add a tourist location if the number of current locations < 5

    public void addTouristLocation(String touristLocation) {
        if (touristLocationsList.size() < MAX_NO_LOCATIONS) {
            touristLocationsList.add(touristLocation);
        }

        else {
            System.out.println("max no of tourist spots already added");
        }
    }

//     touristLocation
//     it takes a tourist location as input, searches for
//     that location in the list and removes it.

    public void removeTouristLocation(String touristLocation) {
        Iterator iterator = touristLocationsList.iterator();
        String temp;

        while (iterator.hasNext()) {
            temp = (String) iterator.next();
            if (temp.equals(touristLocation)) {
                iterator.remove();
            }
        }
    }
}