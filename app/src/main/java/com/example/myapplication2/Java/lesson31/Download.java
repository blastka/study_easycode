package com.example.myapplication2.Java.lesson31;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Date;

public class Download extends Thread {

    private final String name;

    public Download(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("starting at " + new Date());
        final String url = "https://mobimg.b-cdn.net/v3/fetch/b0/b029ca34284a080eb5c509994966d6f1.jpeg";

        try (BufferedInputStream inputStream = new BufferedInputStream(new URL(url).openStream())) {
            FileOutputStream fileOutputStream = new FileOutputStream(name + ".jpeg");
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer, 0, 1024)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finished at " + new Date());
        }
    }


}
