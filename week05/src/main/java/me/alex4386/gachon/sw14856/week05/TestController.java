package me.alex4386.gachon.sw14856.week05;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
    @GetMapping("/example")
    public String example(
            Model model,
            @RequestParam(name = "name", required = false)
            String name
    ) {
        model.addAttribute("name", name != null ? name : "World");
        return "example";
    }
}
