package me.alex4386.gachon.sw14856.week02.hello;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HelloModel {
    public String hello = "world";
}
