package me.alex4386.gachon.sw14856.week13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreApplication.class, args);
    }

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        System.out.println("Route 등록 확인용 로그");
        return builder.routes()
                .route("test_route", r -> r
                        .path("/get")
                        .filters( f -> f
                                .addRequestHeader("Hello", "World")
                                .addResponseHeader("Hello", "World")
                        )
                        .uri("http://httpbin.org")
                ).build();
    }
}
