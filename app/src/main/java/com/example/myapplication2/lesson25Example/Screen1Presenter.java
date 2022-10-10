package com.example.myapplication2.lesson25Example;

public class Screen1Presenter extends Presenter<Screen1View>{
    @Override
    public void updateUi(Screen1View view) {
        super.updateUi(view);
        view.goToScreen2();
    }

    @Override
    public void stop() {

    }
}
