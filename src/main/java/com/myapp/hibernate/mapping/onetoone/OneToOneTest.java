package com.myapp.hibernate.mapping.onetoone;

import com.myapp.hibernate.HibernateUtil;
import com.myapp.hibernate.inheritance.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Id;

/**
 * Created by indianic on 23-Feb-17.
 */
public class OneToOneTest {

    public static void main(String args[]){

        Country country = new Country();
        country.setName("India");
        country.setNotAllowed(false);

        
        NotAllowedCountry nac = new NotAllowedCountry();
        nac.setNotAllowedBusinessCountry(false);
        nac.setNotAllowedRegisterCountry(true);
        nac.setNotAllowedUBO(true);
        nac.setNotAllowedUBOCitizenship(true);
        nac.setCountry(country);


        HibernateUtil.create(country); //with usage of CascadeType.ALL
        //HibernateUtil.create(cart, nac); //with usage of CascadeType.ALL
        // HibernateUtil.create(item1); //uncomment this line you not added CascadeType.ALL in Cart Entity
        // HibernateUtil.create(item2); //uncomment this line you not added CascadeType.ALL in Cart Entity
        
//        	Country country = (Country) HibernateUtil.get(2, Country.class);
//
//          System.out.println("country " + country.getId());
//          System.out.println("country " + country.getNotAllowedCountry().getNotAllowedBusinessCountry());
//          System.out.println("country " + country.getNotAllowedCountry().getNotAllowedRegisterCountry());
         
        System.exit(0);

    }

}
