package com.nobel.mediator;


public class ListBox extends UIControl {
    // should has List of articles and selection >>> for simplicity only selection
    private String selection;

    public ListBox(DialogBox owner) {
        super(owner);
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        owner.onChanged(this);
    }

}
