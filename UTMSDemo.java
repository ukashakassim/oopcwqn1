package UTMSDemo;

import users.*;
import support.*;

public class UTMSDemo {
    public static void main(String[] args) {
        // Create users
        User student = new Student("S001", "John Doe", "john@vu.ac.ug", "password", 
                                 "ST2023/001", "Computer Science");
        User lecturer = new Lecturer("L001", "Dr. Smith", "smith@vu.ac.ug", "password", 
                                    "Science", "BLK 2-101");
        User officer = new TransportOfficer("TO01", "Alex Johnson", "alex@vu.ac.ug", 
                                          "password", "BDG123");
        
        // Demonstrate runtime polymorphism
        System.out.println("=== Transport Requests ===");
        student.requestTransport();
        lecturer.requestTransport();
        officer.requestTransport();
        
        // Create vehicles
        Bus bus = new Bus("BUS001", "Volvo", 50);
        Van van = new Van("VAN001", "Toyota", 12);
        
        // Demonstrate interface implementation
        System.out.println("\n=== Vehicle Maintenance ===");
        bus.performMaintenance();
        van.performMaintenance();
        
        System.out.println("\n=== Vehicle Tracking ===");
        bus.updateLocation("Main Campus");
        van.updateLocation("Market Plaza");
        
        // Demonstrate method overloading
        System.out.println("\n=== Driver Assignment ===");
        TransportOfficer transportOfficer = (TransportOfficer)officer;
        Driver driver = new Driver("D001", "Michael Brown", "DL12345");
        
        transportOfficer.assignDriver(driver);
        transportOfficer.assignDriver(driver, "Bus");
        transportOfficer.assignDriver(driver, "Van", "Evening");
        
        // Demonstrate scheduling
        System.out.println("\n=== Route Scheduling ===");
        Route route = new Route("R001", "Main Campus", "City Center", "7:30 AM, 5:30 PM");
        bus.assignRoute(route);
        System.out.println("Bus schedule: " + bus.getSchedule());
    }
}