
package SERVICE.IMPLEMENTATION;

import DAO.SignUpDAO;
import MODEL.SignupModel;
import SERVICE.SignupSERVICE;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SignupIMPLEMENTATION extends UnicastRemoteObject implements SignupSERVICE{

    public SignupIMPLEMENTATION() throws RemoteException {
    }
    SignUpDAO dao= new SignUpDAO();

    @Override
    public SignupModel RegisterUser(SignupModel user) throws RemoteException {
         //To change body of generated methods, choose Tools | Templates.
         return dao.registerUser(user);
    }

    @Override
    public SignupModel authenticateUser(String email, String password) throws RemoteException {
        return dao.authenticateUser(email, password);
    }

    }

