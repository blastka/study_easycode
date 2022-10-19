package com.example.myapplication2.Java.lesson26;

public interface DataCallback {
    void returnSuccess(DataContainer dataContainer);
    void returnError(ErrorInfo errorInfo);
}
