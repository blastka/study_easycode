package com.example.myapplication2.Java.lesson27;

import androidx.annotation.Nullable;

import com.example.myapplication2.Java.lesson26.DataCallback;
import com.example.myapplication2.Java.lesson26.DataContainer;
import com.example.myapplication2.Java.lesson26.ErrorInfo;

/**
 * Паттерн наблюдатель. Через сеттер прокидывать из вне,
 * когда колбэк не нужен, его занулять
 */
public class Executor {

    private DataCallback<DataContainer, ErrorInfo> dataCallback;

    public void setDataCallback(DataCallback<DataContainer, ErrorInfo> dataCallback) {
        this.dataCallback = dataCallback;
    }

    @Nullable
    public void execute(){
        try{
            if (dataCallback != null)
                dataCallback.returnSuccess(new DataContainer());
        }catch (Exception e){
            dataCallback.returnError(new ErrorInfo(e.getMessage(), e.getCause().toString()));
        }
    }
}
