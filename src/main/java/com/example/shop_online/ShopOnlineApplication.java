package com.example.shop_online;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class ShopOnlineApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ShopOnlineApplication.class, args);
    }

}
