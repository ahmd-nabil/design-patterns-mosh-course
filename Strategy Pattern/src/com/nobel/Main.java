package com.nobel;

public class Main {

    public static void main(String[] args) {
	    ImageStorage imageStorage = new ImageStorage();
	    imageStorage.store("pic", new PngCompressor(), new HighContrastFilter());
    }
}
