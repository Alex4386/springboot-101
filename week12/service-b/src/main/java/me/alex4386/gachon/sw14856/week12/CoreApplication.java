package me.alex4386.gachon.sw14856.week12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CoreApplication{
    public static void main(String[] args) {
        SpringApplication.run(CoreApplication.class, args);
    }
}
