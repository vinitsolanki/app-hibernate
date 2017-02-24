package com.myapp.hibernate.inheritance;

import com.myapp.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Created by indianic on 23-Feb-17.
 */
public class InheritanceTest {
    public static void main(String args[]){

        Vehicle vehicle = new Vehicle();
        vehicle.setName("Discover");

        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.setName("Bike");
        twoWheeler.setSteeringTwoWheeler("red discover");

        FourWheeler fourWheeler = new FourWheeler();
        fourWheeler.setName("Alto red");
        fourWheeler.setSteeringFourWheeler("Alto red");

        HibernateUtil.create(vehicle, twoWheeler, fourWheeler);

        System.exit(0);
    }

}
