package com.nobel;

public class Compressor extends Handler {

    public Compressor() {
        super(null);
    }

    public Compressor(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Compression");
        return false;
    }

}
