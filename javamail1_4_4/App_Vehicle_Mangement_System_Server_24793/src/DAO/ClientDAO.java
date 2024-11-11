
package DAO;

import MODEL.ClientModel;
import java.util.List;
import org.hibernate.Session;

public class ClientDAO {
    public ClientModel RegisterClient(ClientModel clientObj){
    try{
         Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.save(clientObj);
            ss.beginTransaction().commit();
            ss.close();
            return clientObj;  
    } catch(Exception ex){
        ex.printStackTrace();
    }
    return null;    
  }  
  

  
    public ClientModel UpdateClient(ClientModel clientObj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.update(clientObj);
            ss.beginTransaction().commit();
            ss.close();
            return clientObj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        
        return null;
    }
 
    public ClientModel DeleteClient(ClientModel clientObj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.delete(clientObj);
            ss.beginTransaction().commit();
            ss.close();
            return clientObj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        
        return null;
    }
    
   
    
    public ClientModel searching(ClientModel clientObj){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            
            ClientModel client=(ClientModel) ss.get(ClientModel.class,clientObj.getClientId());
            return client;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return null;
    }

     public List<ClientModel> allclient(){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession(); 
            List<ClientModel> listclient= ss.createQuery("select theclient from ClientModel theclient").list();
            return  listclient;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return null;
    }
    
    
}
