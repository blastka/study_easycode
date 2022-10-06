package com.example.myapplication2.Java.Lesson21;

public class PDFFile {
    private final String data;

    public PDFFile(String data) {
        this.data = data;
    }

    public void share(Share option){
        option.share(data);
    }
}
