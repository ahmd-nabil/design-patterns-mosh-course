package com.nobel;

public class Main {

    public static void main(String[] args) {
	    Editor editor = new Editor("Default Title", "Default Content");
	    History history = new History();

	    // Visiting Google
        history.push(editor.getCurrentState());
        editor.setTitle("Google");
        editor.setContent("Google Searching Page.");

        // Searching for Udemy
        history.push(editor.getCurrentState());
        editor.setTitle("Udemy");
        editor.setContent("Udemy page");

        // clicking back button
        editor.restore(history.pop());

        System.out.println(editor.getTitle());
        System.out.println(editor.getContent());
    }
}
