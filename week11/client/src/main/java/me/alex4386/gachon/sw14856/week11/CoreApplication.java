package me.alex4386.gachon.sw14856.week11;

import me.alex4386.gachon.sw14856.week11.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class CoreApplication implements CommandLineRunner {

    @Autowired
    private Service service;

    public static void main(String[] args) {
        SpringApplication.run(CoreApplication.class, args);
    }

    @Override
    public void run(String[] args) {
        service.print();
    }
}
