package me.alex4386.gachon.sw14856.week06.controllers;

import me.alex4386.gachon.sw14856.week06.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    User gachon;

    public UserController() {
        this.gachon = gachon;
    }

    @Override
    public String toString() {
        return "UserController{" +
                "gachon=" + gachon +
                '}';
    }
}
