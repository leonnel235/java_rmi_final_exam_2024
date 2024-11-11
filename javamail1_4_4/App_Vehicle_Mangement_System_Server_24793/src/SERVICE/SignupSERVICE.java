
package SERVICE;

import MODEL.SignupModel;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface SignupSERVICE extends Remote{
    SignupModel RegisterUser (SignupModel user) throws RemoteException;
    SignupModel authenticateUser(String email, String password) throws RemoteException;
    
}
