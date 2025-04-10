package me.alex4386.gachon.sw14856.week06.services;

import org.springframework.stereotype.Service;

@Service
public interface MessageService {
    boolean sendMessage(String msg, String rec);
}