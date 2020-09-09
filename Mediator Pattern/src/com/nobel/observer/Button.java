package com.nobel.observer;

public class Button extends UIControl {
    private boolean isEnabled;

    public void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        notifyObservers();
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
