package com.nobel;


public class Main {

    public static void main(String[] args) {
        // authenticator >>> logger >>> compressor
        Encryptor encryptor = new Encryptor();
        Compressor compressor = new Compressor(encryptor);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);

        WebServer server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "admin"));
    }
}
