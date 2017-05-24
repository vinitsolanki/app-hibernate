package com.myapp.hibernate.embedding;

import com.myapp.hibernate.HibernateUtil;

/**
 * Created by indianic on 23-Feb-17.
 */
public class EmbeddingTest {

    public static void main(String args[]){

        Address address = new Address("street", "city", "1234", "state");
        Person person = new Person("John Doe", address);

        HibernateUtil.create(person);

        

        System.exit(0);
    }


}
