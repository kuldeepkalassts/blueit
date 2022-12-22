package com.kk.blueit.config;


import org.hibernate.internal.util.MutableInteger;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.lang.invoke.MutableCallSite;

public class BaseProperties {


    public BaseProperties(){
        System.out.println("Init the base properties");
    }
    private String testPropertiesString;
    private Integer testIntegerProperties;

    public String getTestPropertiesString() {
        return testPropertiesString;
    }

    public void setTestPropertiesString(String testPropertiesString) {
        this.testPropertiesString = testPropertiesString;
    }

    public Integer getTestIntegerProperties() {
        return testIntegerProperties;
    }

    public void setTestIntegerProperties(Integer testIntegerProperties) {
        this.testIntegerProperties = testIntegerProperties;
    }
}
