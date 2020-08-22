package com.nobel;

public class ImageStorage {
    public void store(String fileName, Compressor compressor, Filter filter) {
        // compression: JPEG, PNG, ....
        // filter: B&W, High contrast, ...

        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
