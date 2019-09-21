/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Mkhansen;
 */
@Entity
public class Customer3 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn
    private List<Address3> addresses = new ArrayList();
//    @OneToOne(cascade = CascadeType.PERSIST)
//    private Address3 address;

    public void addAddress(Address3 address){
        addresses.add(address);
    }

    public List<Address3> getAddresses() {
        return addresses;
    }
    
    public Customer3() {
    }

    public Customer3(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

//    public Address3 getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address3 address) {
//        this.address = address;
//        this.address.setCustomer(this);
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer3)) {
            return false;
        }
        Customer3 other = (Customer3) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Customer3[ id=" + id + " ]";
    }
    
}
