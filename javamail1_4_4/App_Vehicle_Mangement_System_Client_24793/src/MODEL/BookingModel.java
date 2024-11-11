
package MODEL;

import java.io.Serializable;
import java.util.Date;


public class BookingModel implements Serializable {
  private Integer bookingId;

  private String Price;
  
  private Date  Bookingdate;
    
  private String Service;
 
   private ClientModel client;

   private VehicleModel vehicle;

    public BookingModel() {
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public Date getBookingdate() {
        return Bookingdate;
    }

    public void setBookingdate(Date Bookingdate) {
        this.Bookingdate = Bookingdate;
    }

    public String getService() {
        return Service;
    }

    public void setService(String Service) {
        this.Service = Service;
    }

    public ClientModel getClient() {
        return client;
    }

    public void setClient(ClientModel client) {
        this.client = client;
    }

    public VehicleModel getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleModel vehicle) {
        this.vehicle = vehicle;
    }

    public BookingModel(Integer bookingId, String Price, Date Bookingdate, String Service, ClientModel client, VehicleModel vehicle) {
        this.bookingId = bookingId;
        this.Price = Price;
        this.Bookingdate = Bookingdate;
        this.Service = Service;
        this.client = client;
        this.vehicle = vehicle;
    }

    public BookingModel(Integer bookingId) {
        this.bookingId = bookingId;
    }
    
}