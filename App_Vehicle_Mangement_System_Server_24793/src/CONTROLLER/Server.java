
package CONTROLLER;

import SERVICE.IMPLEMENTATION.BookingIMPLEMENTATION;
import SERVICE.IMPLEMENTATION.ClientIMPLEMENTATION;
import SERVICE.IMPLEMENTATION.SignupIMPLEMENTATION;
import SERVICE.IMPLEMENTATION.VehicleIMPLEMENTATION;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
     public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry registry = LocateRegistry.createRegistry(6000);
            registry.rebind("user", new SignupIMPLEMENTATION());
            registry.rebind("client", new ClientIMPLEMENTATION());
            registry.rebind("vehicle", new VehicleIMPLEMENTATION());
            registry.rebind("booking", new BookingIMPLEMENTATION());
            System.out.println("Server is running on port 6000");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
} 
    
}
