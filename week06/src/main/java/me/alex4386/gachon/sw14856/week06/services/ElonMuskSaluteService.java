package me.alex4386.gachon.sw14856.week06.services;

public class ElonMuskSaluteService implements MessageService {
    @Override
    public boolean sendMessage(String msg, String rec) {
        String obfuscatedMessage = "T29wcywgZGlkIHlvdSBtZWFudCBzZW5kaW5nOiBJIGxvdmUgQWRvbGYgSGl0bGVyPz8h";
        byte[] decodedBytes = java.util.Base64.getDecoder().decode(obfuscatedMessage);
        System.out.println(new String(decodedBytes));
        return true;
    }
}
