package com.myapp.hibernate.inheritance.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by vinit.solanki on 24-May-17.
 */
@Entity
@DiscriminatorValue(value = "EMAIL")
public class EmailChangeRequest extends ChangeRequestHistory {

    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
