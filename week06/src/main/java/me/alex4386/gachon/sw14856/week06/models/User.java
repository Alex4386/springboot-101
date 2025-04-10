package me.alex4386.gachon.sw14856.week06.models;

import org.springframework.stereotype.Component;

@Component
public class User {
    String name;
    int age;
    String address;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\''   +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
