package me.alex4386.gachon.sw14856.week12;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @GetMapping("/hello")
    public String hello() {
        return "world";
    }
}
