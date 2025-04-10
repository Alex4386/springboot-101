package me.alex4386.gachon.sw14856.week06.services;

public class EmailService implements MessageService {
    @Override
    public boolean sendMessage(String msg, String rec) {
        System.out.println("Email Sent to " + rec + " with Message=" + msg);
        return true;
    }
}
