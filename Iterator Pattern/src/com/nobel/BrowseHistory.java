package com.nobel;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private String[] urls = new String[10];
    private int pushIndex = 0;
    public void push(String url) {
        urls[pushIndex++] = url;
    }

    public Iterator createIterator() {
        return new ArrayIterator(this);
    }

//    private class ListIterator implements Iterator<String> {
//        private BrowseHistory history;
//        private int currentIndex = 0;
//
//        public ListIterator(BrowseHistory history) {
//            this.history = history;
//        }
//
//        @Override
//        public String getCurrent() {
//            return history.urls.get(currentIndex);
//        }
//
//        @Override
//        public void next() {
//            currentIndex++;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return (currentIndex < urls.size());
//        }
//    }

    private class ArrayIterator implements Iterator<String>{
        private BrowseHistory history;
        private int currentIndex = 0;
        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public String getCurrent() {
            return history.urls[currentIndex];
        }

        @Override
        public void next() {
            currentIndex++;
        }

        @Override
        public boolean hasNext() {
            return history.urls[currentIndex] != null;
        }
    }
}
