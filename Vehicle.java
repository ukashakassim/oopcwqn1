package users;

public abstract class Vehicle {
    private final String registrationNumber;
    private final String model;
    private final int capacity;

    public Vehicle(String registrationNumber, String model, int capacity) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.capacity = capacity;
    }

    public String getRegistrationNumber() { return registrationNumber; }
    public String getModel() { return model; }
    public int getCapacity() { return capacity; }
}