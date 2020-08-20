package com.nobel;

public class State {
    private final String title;  // final because changing is a new state
    private final String content;

    public State(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
