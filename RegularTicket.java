package FlightReservation;
import java.util.List;

public class RegularTicket extends Ticket{
//    For regular tickets, we should be able to keep track of what special services the passengers have requested,
//    such as food, water and snacks. We should be able to check the special services availed by the passengers
//    and also update them if required.

    public List<String> services;

    public RegularTicket(long PNRNumber, int seatNumber, double price, String status, List<String> services) {
        super(PNRNumber, seatNumber, price, status);
        this.services = services;

    }
    public List<String> getServices() {
        return services;
    }

    public void setServices(int index, String service) {
        services.set(index, service);
    }

    public void addService(String service) {
        services.add(service);
    }

    public void deleteService(String service) {
        services.remove(service);
    }
}