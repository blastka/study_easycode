package com.example.myapplication2.Java.lesson26;

import androidx.annotation.Nullable;

public class Executor {

    @Nullable
    public Object execute(){
        try{
            return new DataContainer();
        }catch (Exception e){
            return new ErrorInfo(e.getMessage(), e.getCause().toString());
        }
    }
}
