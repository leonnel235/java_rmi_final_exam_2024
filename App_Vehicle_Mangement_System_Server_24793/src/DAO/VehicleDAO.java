
package DAO;

import MODEL.VehicleModel;
import java.util.List;
import org.hibernate.Session;

public class VehicleDAO {
     public VehicleModel RegisterVehicle(VehicleModel vehicleObj){
    try{
         Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.save(vehicleObj);
            ss.beginTransaction().commit();
            ss.close();
            return vehicleObj;  
    } catch(Exception ex){
        ex.printStackTrace();
    }
    return null;    
  }  
  
  
    public VehicleModel UpdateVehicle(VehicleModel vehicleObj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.update(vehicleObj);
            ss.beginTransaction().commit();
            ss.close();
            return vehicleObj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        
        return null;
    }
 
    public VehicleModel DeleteVehicle(VehicleModel vehicleObj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.delete(vehicleObj);
            ss.beginTransaction().commit();
            ss.close();
            return vehicleObj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        
        return null;
    }
    
   
    
    public VehicleModel searchingVehicle(VehicleModel vehicleObj){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            VehicleModel car=( VehicleModel) ss.get(VehicleModel.class,vehicleObj.getVehicleId());
            return car;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return null;
    }
    
   
    
     public List<VehicleModel> allvehicle(){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession(); 
            List<VehicleModel> listvehicle= ss.createQuery("select thevehicle from VehicleModel thevehicle").list();
            return listvehicle;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return null;
    }
    
    
}
