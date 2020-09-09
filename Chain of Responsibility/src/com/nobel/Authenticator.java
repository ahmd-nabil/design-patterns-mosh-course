package com.nobel;

public class Authenticator extends Handler{

    public Authenticator() {
        super(null);
    }

    public Authenticator(Handler nextHandler) {
        super(nextHandler);
    }

    // returns true if username and password are correct
    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Authentication");
        return !(request.getUsername().equals("admin") && request.getPassword().equals("admin")); // if username and password are right, return false to go to next stage.
    }
}
