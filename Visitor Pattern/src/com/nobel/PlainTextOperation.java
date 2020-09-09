package com.nobel;

public class PlainTextOperation implements Operation {

    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("plaintext-heading");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("plaintext-anchor");
    }
}
