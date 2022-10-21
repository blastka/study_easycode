package com.example.myapplication2.Java.Lesson21;

public class Contact {
    private final String name;
    private final String mail;

    public Contact(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    /**
     * Пример закидывания объект в объект для получения данных не используя геттеры
     * @param share
     */
    public void show(Share share){
        share.share("Name and email = " + name + " " + mail);
    }
}
