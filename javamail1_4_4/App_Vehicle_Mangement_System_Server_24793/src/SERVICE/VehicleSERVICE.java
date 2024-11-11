
package SERVICE;

import MODEL.VehicleModel;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface VehicleSERVICE extends Remote {
   VehicleModel SaveVehicle (VehicleModel vehicle) throws RemoteException;
   VehicleModel EditVehicle (VehicleModel vehicle) throws RemoteException;
   VehicleModel EraseVehicle (VehicleModel vehicle) throws RemoteException;
   VehicleModel SearchVehicle(VehicleModel vehicle) throws RemoteException;
   List<VehicleModel> Listvehicle()throws RemoteException;

    
}
