package tester;

import entity.Address3;
import entity.Customer3;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mkhansen;
 */
public class Tester3 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();

        Customer3 cust = new Customer3("Bob", "Bobsen");
        Address3 add = new Address3("BobStreet", "BobCity");
        Address3 add1 = new Address3("A", "ACity");
        Address3 add2 = new Address3("B", "BCity");
        Address3 add3 = new Address3("C", "CCity");
        cust.addAddress(add);
        cust.addAddress(add1);
        cust.addAddress(add2);
        cust.addAddress(add3);
//        cust.setAddress(add);
//        add.setCustomer(cust);
        try {
            em.getTransaction().begin();
            em.persist(cust);
//            em.persist(add);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
//        em = emf.createEntityManager();
        
//        Address3 found1 = em.find(Address3.class, cust.getAddress().getId());
//        System.out.println("First Name: " + found1.getCustomer().getFirstName());
//        System.out.println("Last Name: " + found1.getCustomer().getLastName());

//        Customer3 found = em.find(Customer3.class, cust.getId());
//        System.out.println("Address3: " + found.getAddress().getCity() + " " + found.getAddress().getStreet());



    }
}
