
package SERVICE.IMPLEMENTATION;

import DAO.VehicleDAO;
import MODEL.VehicleModel;
import SERVICE.VehicleSERVICE;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;


public class VehicleIMPLEMENTATION extends UnicastRemoteObject implements VehicleSERVICE {

    public VehicleIMPLEMENTATION() throws RemoteException {
        super();
    }
    VehicleDAO dao =new VehicleDAO ();

    @Override
    public VehicleModel SaveVehicle(VehicleModel vehicle) throws RemoteException {
         //To change body of generated methods, choose Tools | Templates.
         return dao.RegisterVehicle(vehicle);
    }

    @Override
    public VehicleModel EditVehicle(VehicleModel vehicle) throws RemoteException {
        //To change body of generated methods, choose Tools | Templates.
        return dao.UpdateVehicle(vehicle);
    }

    @Override
    public VehicleModel EraseVehicle(VehicleModel vehicle) throws RemoteException {
         //To change body of generated methods, choose Tools | Templates.
         return dao.DeleteVehicle(vehicle);
    }

    @Override
    public VehicleModel SearchVehicle(VehicleModel vehicle) throws RemoteException {
         //To change body of generated methods, choose Tools | Templates.
         return dao.searchingVehicle(vehicle);
    }

    @Override
    public List<VehicleModel> Listvehicle() throws RemoteException {
        //To change body of generated methods, choose Tools | Templates.
        return dao.allvehicle();
    }
    
}
