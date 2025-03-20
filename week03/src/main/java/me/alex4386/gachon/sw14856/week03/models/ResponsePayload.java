package me.alex4386.gachon.sw14856.week03.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponsePayload<T> {
    public boolean ok;
    public T data;

    public ResponsePayload(boolean ok, T data) {
        this.ok = ok;
        this.data = data;
    }
}
