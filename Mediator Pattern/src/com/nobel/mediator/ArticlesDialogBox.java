package com.nobel.mediator;

public class ArticlesDialogBox extends DialogBox {
    private ListBox articlesListBox = new ListBox(this);  // should use generics + Article objects but let's keep it simple.
    private TextBox titleTextBox = new TextBox(this);
    private Button saveButton = new Button(this);


    public void makeSimulation() {
        articlesListBox.setSelection("article");
        System.out.println(titleTextBox.getContent());
        System.out.println(articlesListBox.getSelection());
        System.out.println(saveButton.isEnabled());

        titleTextBox.setContent(null);
        System.out.println(titleTextBox.getContent());
        System.out.println(articlesListBox.getSelection());
        System.out.println(saveButton.isEnabled());
    }

    @Override
    public void onChanged(UIControl control) {
        if(control == articlesListBox)
            onArticleSelected();
        else if(control == titleTextBox)
            onTitleChanged();
    }

    private void onArticleSelected() {
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }


    private void onTitleChanged() {
        String content = titleTextBox.getContent();
        boolean isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }
}
