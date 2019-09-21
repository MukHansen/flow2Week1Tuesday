/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import entity.Address4;
import entity.Customer4;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mkhansen;
 */
public class Tester4 {
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();

        Customer4 cust = new Customer4("Bat", "Man");
        Address4 add = new Address4("WhateverStreet", "WhateverCity");
        Address4 add1 = new Address4("A", "ACity");
        Address4 add2 = new Address4("B", "BCity");
        Address4 add3 = new Address4("C", "CCity");
        cust.addAddress(add);
        cust.addAddress(add1);
        cust.addAddress(add2);
        cust.addAddress(add3);
        try {
            em.getTransaction().begin();
            em.persist(cust);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
}
