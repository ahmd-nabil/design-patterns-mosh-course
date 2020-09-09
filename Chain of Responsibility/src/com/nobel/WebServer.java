package com.nobel;

public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        if(handler == null)
            throw new IllegalArgumentException("handler can't be null");
        this.handler = handler;
    }

    public void handle(HttpRequest request) {
        // 1- Bad approach because using new Authenticator, Logger, Compressor will make this class tightly coupled with other 3 classes
        // 2- making 3 interfaces will decouple the orders from this class,
        // But it will make the order hard coded here. so, adding or removing new steps will be hard

//        // authenticate
//        Authenticator authenticator = new Authenticator();
//        authenticator.authenticate(request);
//        // log
//        // compress

        // right approach
        handler.handle(request);
    }
}
