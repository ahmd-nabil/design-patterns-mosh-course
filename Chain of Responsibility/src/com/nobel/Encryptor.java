package com.nobel;

public class Encryptor extends Handler {

    public Encryptor() {
        super(null);
    }

    public Encryptor(Handler nextHandler) {
        super(nextHandler);
    }


    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Encyption");
        return false;
    }
}
