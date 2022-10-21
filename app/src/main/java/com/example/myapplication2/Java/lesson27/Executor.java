package com.example.myapplication2.Java.lesson27;

import androidx.annotation.Nullable;

import com.example.myapplication2.Java.lesson26.example1.DataCallback;
import com.example.myapplication2.Java.lesson26.example1.DataContainer;
import com.example.myapplication2.Java.lesson26.example1.ErrorInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Паттерн наблюдатель. Через сеттер прокидывать из вне,
 * когда колбэк не нужен, его занулять
 */
public class Executor {

    private final List<DataCallback<DataContainer, ErrorInfo>> dataCallbacks = new ArrayList<>();

    public void addCallback(DataCallback<DataContainer, ErrorInfo> dataCallback) {
        dataCallbacks.add(dataCallback);
    }

    public void removeCallback(DataCallback<DataContainer, ErrorInfo> dataCallback){
        dataCallbacks.remove(dataCallback);
    }

    @Nullable
    public void execute(){
        try{
            for (DataCallback<DataContainer, ErrorInfo> dataCallback : dataCallbacks) {
                if (dataCallback != null)
                    dataCallback.returnSuccess(new DataContainer());
            }
        }catch (Exception e){
                //dataCallback.returnError(new ErrorInfo(e.getMessage(), e.getCause().toString()));
        }
    }
}
