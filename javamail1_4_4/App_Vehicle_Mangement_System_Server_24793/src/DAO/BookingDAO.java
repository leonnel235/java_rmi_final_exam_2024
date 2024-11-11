
package DAO;

import MODEL.BookingModel;
import java.util.List;
import org.hibernate.Session;

public class BookingDAO {
    public BookingModel RegisterBooking(BookingModel bookingModelObj){
    try{
         Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.save(bookingModelObj);
            ss.beginTransaction().commit();
            ss.close();
            return bookingModelObj;  
    } catch(Exception ex){
        ex.printStackTrace();
    }
    return null;    
  }  
  

  
    public BookingModel UpdateBooking(BookingModel bookingModelObj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.update(bookingModelObj);
            ss.beginTransaction().commit();
            ss.close();
            return bookingModelObj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        
        return null;
    }
  
    public BookingModel DeleteBooking(BookingModel bookingModelObj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.delete(bookingModelObj);
            ss.beginTransaction().commit();
            ss.close();
            return bookingModelObj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        
        return null;
    }
    
  
    
    public BookingModel searching(BookingModel bookingModelObj){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            
            BookingModel booking=(BookingModel) ss.get(BookingModel.class,bookingModelObj.getBookingId());
            return booking;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return null;
    }
    
   
    
     public List<BookingModel> allbooking(){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession(); 
            List<BookingModel> listbooking = ss.createQuery("select thebooking from BookingModel thebooking ").list();
            return listbooking;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return null;
    }
    
    
}
