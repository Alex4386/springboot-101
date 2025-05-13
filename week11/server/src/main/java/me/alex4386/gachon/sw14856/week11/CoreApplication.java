package me.alex4386.gachon.sw14856.week11;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CoreApplication {

    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(CoreApplication.class, args);
    }

}
