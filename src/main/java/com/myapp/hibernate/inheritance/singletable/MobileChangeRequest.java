package com.myapp.hibernate.inheritance.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by vinit.solanki on 24-May-17.
 */
@Entity
@DiscriminatorValue(value = "MOBILE")
public class MobileChangeRequest extends ChangeRequestHistory {

    private String mobile;
    private String mobilePrefix;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobilePrefix() {
        return mobilePrefix;
    }

    public void setMobilePrefix(String mobilePrefix) {
        this.mobilePrefix = mobilePrefix;
    }
}
