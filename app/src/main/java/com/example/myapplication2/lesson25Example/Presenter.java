package com.example.myapplication2.lesson25Example;

public abstract class Presenter<V extends View> {
    protected V view;
    public void updateUi(V view){
        this.view = view;
    }
    public void stop(){
        view = null;
    }

}
