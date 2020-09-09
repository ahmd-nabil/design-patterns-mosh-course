package com.nobel.observer;

import com.nobel.mediator.DialogBox;

public class ListBox extends UIControl {
    private String selection;

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        notifyObservers();
    }
}
