package com.nobel;

public class Main {

    public static void main(String[] args) {
        BrowseHistory history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");
        // BAD WAY, Changing the history class will change main class.
//        for(int i=0; i<history.getUrls().size(); i++) {
//            System.out.println(history.pop(i));
//        }


        Iterator iterator = history.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.getCurrent());
            iterator.next();
        }
    }
}
