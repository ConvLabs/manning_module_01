package com.salon.salonapi.config;

import lombok.Data;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("salon")
@Data
@SpringBootApplication
public class Salon {
    private String name;
    private String address;
    private String city;
    private String state;
    private int zipcode;
    private String phone;
}
