package com.example.viewex.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController { // Fixed typo in class name

   // inject via application.properties
   @Value("${welcome.message}")
   private String message;

   private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f", "g");

   @GetMapping("/")
   public String main(Model model) {
       model.addAttribute("message", message);
       model.addAttribute("tasks", tasks);

       return "welcome"; // view
   }

   // /hello?name=kotlin
   @GetMapping("/hello")
   public String mainWithParam(
           @RequestParam(name = "name", required = false, defaultValue = "") 
           String name,
           Model model) {

       model.addAttribute("message", name);

       return "welcome"; // view
   }

}