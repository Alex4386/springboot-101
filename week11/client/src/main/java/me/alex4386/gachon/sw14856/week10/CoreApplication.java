package me.alex4386.gachon.sw14856.week10;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// Workaround since the professor "REQUIRED" to use the package name "gcu.jpa.h2"
@ComponentScan(basePackages = {"me.alex4386.gachon.sw14856.week10", "gcu.jpa.userdemo"})
@EnableJpaRepositories(basePackages = {"gcu.jpa.userdemo"})
@EntityScan(basePackages = {"gcu.jpa.userdemo"})
public class CoreApplication {

    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(CoreApplication.class, args);
    }

}
