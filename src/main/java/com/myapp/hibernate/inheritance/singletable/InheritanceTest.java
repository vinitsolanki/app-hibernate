package com.myapp.hibernate.inheritance.singletable;

import com.myapp.hibernate.HibernateUtil;

public class InheritanceTest {
    public static void main(String args[]){

        EmailChangeRequest email = new EmailChangeRequest();
        email.setEmail("Vinit@gmail.com");

        HibernateUtil.create(email);

//        MobileChangeRequest mobile = new MobileChangeRequest();
//        mobile.setMobile("9722977939");
//        mobile.setMobilePrefix("+91");
//        HibernateUtil.create(mobile);

        EmailChangeRequest changeRequestHistory = (EmailChangeRequest) HibernateUtil.get(1, EmailChangeRequest.class);

        EmailChangeRequest emailChangeRequest = (EmailChangeRequest) changeRequestHistory;
        System.out.println("emailChangeRequest = " + emailChangeRequest.getId());
        System.out.println("emailChangeRequest = " + emailChangeRequest.getEmail());

        System.exit(0);
    }

}