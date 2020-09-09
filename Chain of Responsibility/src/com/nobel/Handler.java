package com.nobel;

public abstract class Handler {
    private Handler nextHandler;

    public Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Template for all Handlers
    public void handle(HttpRequest request) {
        boolean isHandled = doHandle(request);
        if(isHandled)
            return;

        if(nextHandler != null) nextHandler.handle(request);
    }

    public abstract boolean doHandle(HttpRequest request);
}
