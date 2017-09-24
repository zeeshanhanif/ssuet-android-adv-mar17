package com.demo.ormdemoone;

import com.orm.SugarRecord;

/**
 * Created by Ishaq Hassan on 9/24/2017.
 */

public class BusinessCard extends SugarRecord {
    String companyName;

    public BusinessCard() {
    }

    public BusinessCard(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BusinessCard{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
