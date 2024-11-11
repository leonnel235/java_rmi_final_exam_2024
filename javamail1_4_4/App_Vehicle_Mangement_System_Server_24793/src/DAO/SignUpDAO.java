
package DAO;

import MODEL.SignupModel;
import org.hibernate.Query;
import org.hibernate.Session;


public class SignUpDAO {
     public SignupModel registerUser(SignupModel SignupModelObj){
        try {
             Session ss = HibernateUtil.getSessionFactory().openSession();
             ss.save(SignupModelObj);
             ss.beginTransaction().commit();
             ss.close();
             return SignupModelObj;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    
}
     public SignupModel authenticateUser(String email , String password){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
           String hql = "FROM SignupModel WHERE Email = :Email  AND Password = :Password";
            Query query = ss.createQuery(hql);
            query.setParameter("Email", email );
            query.setParameter("Password", password);
            SignupModel user = (SignupModel) query.uniqueResult();
            ss.close();
            return user;   
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    return null;
    }
}
