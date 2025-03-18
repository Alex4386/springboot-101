package me.alex4386.gachon.sw14856.week03;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// Workaround since the professor "REQUIRED" to use the package name "com.guc.hw"
@ComponentScan(basePackages = {"me.alex4386.gachon.sw14856.week03", "gcu.wa.calculator"})
public class SpringApplication {

    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(SpringApplication.class, args);
    }

}
