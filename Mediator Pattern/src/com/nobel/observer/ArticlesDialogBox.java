package com.nobel.observer;

public class ArticlesDialogBox {

    private TextBox titleTextBox = new TextBox();
    private ListBox articlesListBox = new ListBox();
    private Button saveButton = new Button();

    public ArticlesDialogBox () {
//        titleTextBox.addObserver(() -> onTitleChanged());
//        articlesListBox.addObserver(() -> onArticleSelected());

        titleTextBox.addObserver(this::onTitleChanged);
        articlesListBox.addObserver(this::onArticleSelected);
    }
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
