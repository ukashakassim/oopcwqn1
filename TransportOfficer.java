package users;

import support.Driver;

public class TransportOfficer extends User {
    private final String badgeNumber;

    public TransportOfficer(String userId, String name, String email, String password,
                          String badgeNumber) {
        super(userId, name, email, password);
        this.badgeNumber = badgeNumber;
    }

    @Override
    public void requestTransport() {
        System.out.println("Transport Officer " + getName() + " requests vehicle for inspection");
    }

    // Method overloading examples
    public void assignDriver(Driver driver) {
        System.out.println("Assigned driver " + driver.getName() + " to general duty");
    }

    public void assignDriver(Driver driver, String vehicleType) {
        System.out.println("Assigned driver " + driver.getName() + " to " + vehicleType);
    }

    public void assignDriver(Driver driver, String vehicleType, String shiftTime) {
        System.out.println("Assigned driver " + driver.getName() + 
                         " to " + vehicleType + " for " + shiftTime + " shift");
    }
}