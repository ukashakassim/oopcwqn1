package users;
import interfaces.*;
import support.Route;

public class Bus extends Vehicle implements Serviceable, Schedulable {
    private String lastServiceDate;
    private String currentLocation;
    private Route assignedRoute;

    public Bus(String registrationNumber, String model, int capacity) {
        super(registrationNumber, model, capacity);
    }

    // Serviceable interface implementation
   
    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on bus " + getRegistrationNumber());
        lastServiceDate = java.time.LocalDate.now().toString();
    }

    /**
     *
     * @return
     */
    @Override
    public String getLastServiceDate() {
        return lastServiceDate;
    }

    // Trackable interface implementation
  
   
    public String getCurrentLocation() {
        return currentLocation;
    }

    /**
     *
     * @param newLocation
     */
 
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println("Bus " + getRegistrationNumber() + " moved to " + newLocation);
    }

    // Schedulable interface implementation
  
    @Override
    public void assignRoute(Route route) {
        this.assignedRoute = route;
    }

    /**
     *
     * @return
     */
    @Override
    public String getSchedule() {
        return assignedRoute != null ? assignedRoute.getSchedule() : "No route assigned";
    }
}