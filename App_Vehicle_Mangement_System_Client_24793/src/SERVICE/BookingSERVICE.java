
package SERVICE;

import MODEL.BookingModel;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface BookingSERVICE extends Remote {
    BookingModel SveBooking (BookingModel booking) throws RemoteException;
    BookingModel EditBooking (BookingModel booking) throws RemoteException;
    BookingModel Eraseooking (BookingModel booking) throws RemoteException;
    BookingModel SearchBooking (BookingModel booking) throws RemoteException;
    List<BookingModel> Listbooking()throws RemoteException;

    public BookingModel saveBooking(BookingModel theBooking);
    
    
}
