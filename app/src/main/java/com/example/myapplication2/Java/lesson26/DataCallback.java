package com.example.myapplication2.Java.lesson26;

public interface DataCallback<T,E> {
    void returnSuccess(T dataContainer);
    void returnError(E errorInfo);
    
//Базовая имплементация, она уже использует DataContainer и ErrorInfo
    class Base implements DataCallback<DataContainer, ErrorInfo>{

        private final Log log;

        public Base(Log log) {
            this.log = log;
        }

        @Override
        public void returnSuccess(DataContainer dataContainer) {
            dataContainer.show();
        }

        @Override
        public void returnError(ErrorInfo errorInfo) {
            errorInfo.log(log);
        }
    }
}
