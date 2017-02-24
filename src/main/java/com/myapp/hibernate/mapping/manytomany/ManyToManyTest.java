package com.myapp.hibernate.mapping.manytomany;

import com.myapp.hibernate.HibernateUtil;
import com.myapp.hibernate.mapping.onetomany.Cart;
import com.myapp.hibernate.mapping.onetomany.Items;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by indianic on 23-Feb-17.
 */
public class ManyToManyTest {

    public static void main(String args[]){

        Group groupAdmin = new Group("Administrator Group");
        Group groupGuest = new Group("Guest Group");

        User user1 = new User("Tom", "tomcat", "tom@codejava.net");
        User user2 = new User("Mary", "mary", "mary@codejava.net");

        groupAdmin.addUser(user1);
        groupAdmin.addUser(user2);

        groupGuest.addUser(user1);

        user1.addGroup(groupAdmin);
        user2.addGroup(groupAdmin);
        user1.addGroup(groupGuest);

        HibernateUtil.create(groupAdmin);
        HibernateUtil.create(groupGuest);

        System.exit(0);

    }
}
