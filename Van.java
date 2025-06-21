package users;
import interfaces.*;

public class Van extends Vehicle implements Serviceable {
    private String lastServiceDate;
    private String currentLocation;
    

    public Van(String registrationNumber, String model, int capacity) {
        super(registrationNumber, model, capacity);
    }

    // Serviceable interface implementation
   
    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on van " + getRegistrationNumber());
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

  
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println("Van " + getRegistrationNumber() + " moved to " + newLocation);
    }
}