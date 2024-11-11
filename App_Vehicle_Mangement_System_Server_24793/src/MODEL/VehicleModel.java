
package MODEL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
@Entity
public class VehicleModel implements Serializable {
 @Id
 @GeneratedValue (strategy = GenerationType.IDENTITY) 
 @Column(name="vehicle_Id")
 private Integer VehicleId;
 @Column(name="vehicle_model")
 private String VehicleModel;
 @Column(name="vehicle_color")
  private String VehicleColor;
 @Column(name="vehicle_licence")
 private String VehicleLicence;
 @OneToMany(mappedBy = "vehicle",fetch = FetchType.EAGER)
 private List<BookingModel> bookings = new ArrayList<>();

    public VehicleModel() {
    }

    public Integer getVehicleId() {
        return VehicleId;
    }

    public void setVehicleId(Integer VehicleId) {
        this.VehicleId = VehicleId;
    }

    public String getVehicleModel() {
        return VehicleModel;
    }

    public void setVehicleModel(String VehicleModel) {
        this.VehicleModel = VehicleModel;
    }

    public String getVehicleColor() {
        return VehicleColor;
    }

    public void setVehicleColor(String VehicleColor) {
        this.VehicleColor = VehicleColor;
    }

    public String getVehicleLicence() {
        return VehicleLicence;
    }

    public void setVehicleLicence(String VehicleLicence) {
        this.VehicleLicence = VehicleLicence;
    }

    public List<BookingModel> getBookings() {
        return bookings;
    }

    public void setBookings(List<BookingModel> bookings) {
        this.bookings = bookings;
    }

    public VehicleModel(Integer VehicleId, String VehicleModel, String VehicleColor, String VehicleLicence) {
        this.VehicleId = VehicleId;
        this.VehicleModel = VehicleModel;
        this.VehicleColor = VehicleColor;
        this.VehicleLicence = VehicleLicence;
    }

    public VehicleModel(Integer VehicleId) {
        this.VehicleId = VehicleId;
    }
    
}
