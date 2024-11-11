
package SERVICE;

import MODEL.ClientModel;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface ClientSERVICE  extends Remote{
    ClientModel SveClient (ClientModel booking) throws RemoteException;
    ClientModel EditClient (ClientModel booking) throws RemoteException;
    ClientModel EraseClient (ClientModel booking) throws RemoteException;
    ClientModel SearchClient (ClientModel booking) throws RemoteException;
   List<ClientModel> Listclient()throws RemoteException;
    
}
