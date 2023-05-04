package com.smartCloth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.smartCloth.repository"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SmartClothApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartClothApplication.class, args);
    }

}
