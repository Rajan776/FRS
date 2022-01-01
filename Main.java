package FlightReservation;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Main {
      public static void main(String[] args) {
//    Address
            Address address = new Address("Parel", "Mumbai", "Maharastra");
            System.out.println(address.address());
            System.out.println("---------------------------------------------------------------------------");


//    Contact
            Contact contact = new Contact("Rajan", 123456789, "tiwarirajan776@gmail.com");
            System.out.println(contact.contact());
            System.out.println("---------------------------------------------------------------------------");

//    Flight
            //accessing attributes and methods of Flight class
            LocalDate departureDate = LocalDate.of(2022, 01, 01);
            LocalTime departureTime = LocalTime.of(7, 30);
            LocalDateTime departureDateTime = LocalDateTime.of(departureDate, departureTime);
            LocalDate arrivalDate = LocalDate.of(2022, 01, 01);
            LocalTime arrivalTime = LocalTime.of(9, 30);
            LocalDateTime arrivalDateTime = LocalDateTime.of(arrivalDate, arrivalTime);
            Flight flight = new Flight(1234, "AirIndia", 100, 55, "Mumbai",
                    "Maharastra", departureDateTime, arrivalDateTime);

            System.out.println(flight.flight());
            System.out.println("---------------------------------------------------------------------------");

//    Passenger
//    accessing attributes and methods of Passenger class
            Passenger passenger = new Passenger("Rajan Tiwari", 123456789, "tiwarirajan776@gmail.com");
            System.out.println(passenger.getId());
            System.out.println("---------------------------------------------------------------------------");

//    RegularTicket
//    accessing attributes and methods of RegularTicket class
            List<String> services = new ArrayList<>();
            services.add("food");
            services.add("water");

            RegularTicket regularTicket = new RegularTicket(7122, 12, 2500, "Confirmed", services);

            regularTicket.addService("Water");
            regularTicket.deleteService("food");
            regularTicket.setServices(0, "Food");
            System.out.println("services availed by passenger are: " + regularTicket.getServices());


            System.out.println("---------------------------------------------------------------------------");

//    Ticket
            Ticket ticket = new Ticket(7122, 12, 2500, "Confirmed");
            System.out.println(ticket.ticket());
            System.out.println("---------------------------------------------------------------------------");

//    TouristTicket
//    accessing attributes and methods of TouristTicket class

            Address hotelAddress = new Address("street1", "city1", "state1");
            List<String> touristLocationsList = new ArrayList<>();
            touristLocationsList.add("pune");
            touristLocationsList.add("Nagpur");

            TouristTicket touristTicket = new TouristTicket("Mumbai ", 7122, 12, 2500, "Confirmed",
                    touristLocationsList);

            touristTicket.addTouristLocation("ECR");
            touristTicket.removeTouristLocation("pune");
            List<String> locations = touristTicket.getTouristLocations();
            System.out.println("Tourist locations: " + locations);
      }
}
