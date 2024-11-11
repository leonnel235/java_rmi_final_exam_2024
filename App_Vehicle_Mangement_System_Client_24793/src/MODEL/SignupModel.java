
package MODEL;

import java.io.Serializable;

public class SignupModel implements Serializable {
    private Integer userid;
    private String username;
    private String Email;
    private String telephone;
    private String password;

    public SignupModel() {
    }

    public SignupModel(Integer userid) {
        this.userid = userid;
    }

    public SignupModel(Integer userid, String username, String Email, String telephone, String password) {
        this.userid = userid;
        this.username = username;
        this.Email = Email;
        this.telephone = telephone;
        this.password = password;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
