package me.alex4386.gachon.sw14856.week09;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// Workaround since the professor "REQUIRED" to use the package name "gcu.jpa.h2"
@ComponentScan(basePackages = {"me.alex4386.gachon.sw14856.week09", "gcu.jpa.h2"})
@EnableJpaRepositories(basePackages = {"gcu.jpa.h2"})
@EntityScan(basePackages = {"gcu.jpa.h2"})
public class CoreApplication {

    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(CoreApplication.class, args);
    }

}
