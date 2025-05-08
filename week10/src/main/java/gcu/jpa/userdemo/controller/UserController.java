package gcu.jpa.userdemo.controller;

import gcu.jpa.userdemo.service.UserService;
import gcu.jpa.userdemo.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody UserDto user) {
        userService.saveUser(user);
        return ResponseEntity.ok("User created");
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@RequestParam Long id) {
        return ResponseEntity.ok(userService.getUser(id));
    }
}
