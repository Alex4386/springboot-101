package me.alex4386.gachon.springboot_test.hello;

import me.alex4386.gachon.springboot_test.Scalar;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String apiSpec() {
        return Scalar.generateScalarDocs("/swagger-ui");
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, world!";
    }

    @GetMapping("/user")
    public User getUser() {
        User user = new User();
        user.setName("Gachon");
        user.setAge(25);
        return user;
    }

    @GetMapping("/hello.json")
    public static ResponseEntity<HelloModel> hello() {
        return new ResponseEntity(new HelloModel(), HttpStatus.OK);
    }
}