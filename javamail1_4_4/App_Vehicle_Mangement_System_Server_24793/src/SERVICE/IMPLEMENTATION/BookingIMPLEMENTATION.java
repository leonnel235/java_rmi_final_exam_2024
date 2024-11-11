
package SERVICE.IMPLEMENTATION;

import DAO.BookingDAO;
import MODEL.BookingModel;
import SERVICE.BookingSERVICE;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class BookingIMPLEMENTATION  extends UnicastRemoteObject implements BookingSERVICE{

    public BookingIMPLEMENTATION() throws RemoteException {
        super();
    }
    BookingDAO  dao= new  BookingDAO();
    

    @Override
    public BookingModel SveBooking(BookingModel booking) throws RemoteException {
        
        return dao.RegisterBooking(booking);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BookingModel EditBooking(BookingModel booking) throws RemoteException {
       
        return dao.UpdateBooking(booking);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BookingModel Eraseooking(BookingModel booking) throws RemoteException {
         return dao.UpdateBooking(booking); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BookingModel SearchBooking(BookingModel booking) throws RemoteException {
        return dao.searching(booking); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BookingModel> Listbooking() throws RemoteException {
        return dao.allbooking(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
