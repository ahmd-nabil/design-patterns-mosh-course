package com.nobel;

public class Editor {
    private String title;
    private String content;

    public Editor(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public State getCurrentState() {
        return new State(title, content);
    }

    public void restore(State state) {
        title = state.getTitle();
        content = state.getContent();
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
