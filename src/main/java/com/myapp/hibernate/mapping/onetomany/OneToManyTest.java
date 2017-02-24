package com.myapp.hibernate.mapping.onetomany;

import com.myapp.hibernate.HibernateUtil;
import com.myapp.hibernate.inheritance.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by indianic on 23-Feb-17.
 */
public class OneToManyTest {

    public static void main(String args[]){

        Cart cart = new Cart();
        cart.setName("MyCart");

        Set<Items> itemsSet = new HashSet<Items>();
        itemsSet.add(new Items("I10", 10, 1, cart));
        itemsSet.add(new Items("I20", 20, 2, cart));
        cart.setItems(itemsSet);
        cart.setTotal(10*1 + 20*2);

        HibernateUtil.create(cart); //with usage of CascadeType.ALL
        // HibernateUtil.create(item1); //uncomment this line you not added CascadeType.ALL in Cart Entity
        // HibernateUtil.create(item2); //uncomment this line you not added CascadeType.ALL in Cart Entity

        System.exit(0);

    }

}
