package com.nobel;

public class Main {

    public static void main(String[] args) {
        HtmlDocument htmlDocument = new HtmlDocument();
        htmlDocument.addNode(new HeadingNode());
        htmlDocument.addNode(new AnchorNode());

        htmlDocument.execute(new HighLightOperation());
        htmlDocument.execute(new PlainTextOperation());
    }
}
