package com.example.myapplication2.lesson25Example;

public abstract class Fragment<V extends View, T extends Presenter<V>> {
    private T presenter;

    protected Fragment(T presenter){
        this.presenter = presenter;
    }

    public void onPause() {
        presenter.stop();
    }

    public void onResume(V view) {
        presenter.updateUi(view);
    }
}
