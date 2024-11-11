
package SERVICE.IMPLEMENTATION;

import DAO.ClientDAO;
import MODEL.ClientModel;
import SERVICE.ClientSERVICE;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class ClientIMPLEMENTATION extends UnicastRemoteObject implements ClientSERVICE {

    public ClientIMPLEMENTATION()throws RemoteException {
        super();
        
    }
    ClientDAO dao =new ClientDAO();
    

    @Override
    public ClientModel SveClient(ClientModel booking) throws RemoteException {
       //To change body of generated methods, choose Tools | Templates.
       return dao.RegisterClient(booking);
    }

    @Override
    public ClientModel EditClient(ClientModel booking) throws RemoteException {
         //To change body of generated methods, choose Tools | Templates.
         return dao.UpdateClient(booking);
    }

    @Override
    public ClientModel EraseClient(ClientModel booking) throws RemoteException {
        //To change body of generated methods, choose Tools | Templates.
        return dao.DeleteClient(booking);
    }

    @Override
    public ClientModel SearchClient(ClientModel booking) throws RemoteException {
        //To change body of generated methods, choose Tools | Templates.
        return dao.searching(booking);
    }

    @Override
    public List<ClientModel> Listclient() throws RemoteException {
        //To change body of generated methods, choose Tools | Templates.
        return dao.allclient();
    }
    
}
