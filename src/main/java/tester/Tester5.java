/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import entity.Address5;
import entity.Customer5;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mkhansen;
 */
public class Tester5 {
    
        public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();

        Customer5 cust = new Customer5("That", "Guy");
        Address5 add = new Address5("ThatStreet", "ThatCity");
        Address5 add1 = new Address5("TA", "TACity");
        Address5 add2 = new Address5("TB", "TBCity");
        Address5 add3 = new Address5("TC", "TCCity");
        
        Address5 address = new Address5("That", "Man");
        Customer5 addCust = new Customer5("NoStreet", "NoCity");
        Customer5 addCust1 = new Customer5("GoneWrongStreet", "GoneWrongCity");
        Customer5 addCust2 = new Customer5("ShitStreet", "ShitCity");
        Customer5 addCust3 = new Customer5("BirdStreet", "BirdCity");
        try {
            em.getTransaction().begin();
            em.persist(cust);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
