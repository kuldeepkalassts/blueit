package com.kk.blueit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class AppConfig {
    //@Bean
    //@ConfigurationProperties(prefix="baseproperties")
    BaseProperties baseProperties(){
        return new BaseProperties();
    }
}
