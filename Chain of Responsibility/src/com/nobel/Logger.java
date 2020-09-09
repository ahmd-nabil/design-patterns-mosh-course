package com.nobel;

public class Logger extends Handler{
    public Logger() {
        super(null);
    }

    public Logger(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Logging");
        return false;
    }
}
