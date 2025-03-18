package me.alex4386.gachon.sw14856.week02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// Workaround since the professor "REQUIRED" to use the package name "com.guc.hw"
@ComponentScan(basePackages = {"me.alex4386.gachon.sw14856.week02", "com.guc.hw"})
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

}
