package com.example.myapplication2.Java.lesson26;

import androidx.annotation.Nullable;

public class Executor {
    /**
     * Если пустой тип, как вернуть тогда эти два объекта?
     * Для возвращений нескольких объектов DataContainer или ErrorInfo сделали callback
     */
    @Nullable
    public void execute(DataCallback dataCallback){
        try{
            dataCallback.returnSuccess(new DataContainer());
        }catch (Exception e){
            dataCallback.returnError(new ErrorInfo(e.getMessage(), e.getCause().toString()));
        }
    }
}
