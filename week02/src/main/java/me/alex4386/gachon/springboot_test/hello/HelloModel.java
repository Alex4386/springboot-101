package me.alex4386.gachon.springboot_test.hello;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HelloModel {
    public String hello = "world";
}
