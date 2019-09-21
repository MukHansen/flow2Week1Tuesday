package tester;

import entity.Customer1;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mkhansen;
 */
public class Tester1 {
    public static void main(String[] args) {
        Customer1 cust1 = new Customer1("John johnson");
        cust1.addHobby("Whatever");
        cust1.addHobby("The");
        cust1.addHobby("Fuck");
        cust1.addHobby("He");
        cust1.addHobby("Wants");
        Customer1 cust2 = new Customer1("Bob Bobson");
        cust2.addHobby("School");
        cust2.addHobby("And Stuff");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        
        EntityManager em = emf.createEntityManager();
        
        try{
            em.getTransaction().begin();
            em.persist(cust1);
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }
    
}
