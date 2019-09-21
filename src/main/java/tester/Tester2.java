package tester;

import entity.Customer2;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mkhansen;
 */
public class Tester2 {
        public static void main(String[] args) {
        Customer2 cust = new Customer2("Philly phoneless");
        cust.addPhone("22446688", "Phillys 1st Phone");
        cust.addPhone("35342242", "Phillys 2nd Phone");
        cust.addPhone("73638736", "Phillys 3rd Phone");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        
        try{
            em.getTransaction().begin();
            em.persist(cust);
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }
}
