
package MODEL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity
public class ClientModel implements Serializable {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name="client_Id")
private Integer ClientId;
@Column(name="name")
    private String Name;
@Column(name="email")
    private String Email;
@Column(name="phone_number")
    private String  Phone_number;
@OneToMany(mappedBy = "client",fetch = FetchType.EAGER)
    private  List<BookingModel> bookings =new ArrayList<>();

    public ClientModel() {
    }

    public Integer getClientId() {
        return ClientId;
    }

    public void setClientId(Integer ClientId) {
        this.ClientId = ClientId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String Phone_number) {
        this.Phone_number = Phone_number;
    }

    public List<BookingModel> getBookings() {
        return bookings;
    }

    public void setBookings(List<BookingModel> bookings) {
        this.bookings = bookings;
    }

    public ClientModel(Integer ClientId, String Name, String Email, String Phone_number) {
        this.ClientId = ClientId;
        this.Name = Name;
        this.Email = Email;
        this.Phone_number = Phone_number;
    }

    public ClientModel(Integer ClientId) {
        this.ClientId = ClientId;
    }

    
}
