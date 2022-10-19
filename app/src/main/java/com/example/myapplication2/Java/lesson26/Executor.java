package com.example.myapplication2.Java.lesson26;

import androidx.annotation.Nullable;

public class Executor {
    /**
     * Если пустой тип, как вернуть тогда эти два объекта?
     * Сымитировали невозможность адекватного получения разных типов через return
     */
    @Nullable
    public Object execute(){
        try{
            return new DataContainer();
        }catch (Exception e){
            return new ErrorInfo(e.getMessage(), e.getCause().toString());
        }
    }
}
