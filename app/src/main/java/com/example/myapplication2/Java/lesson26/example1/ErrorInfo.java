package com.example.myapplication2.Java.lesson26.example1;

public class ErrorInfo {
    private final String message;
    private final String cause;

    public ErrorInfo(String message, String cause) {
        this.message = message;
        this.cause = cause;
    }

    /**
     * Используем метод в интерфейсе? не поняла как.
     * В аргументах интерфейс, и используем метод не реализованный, а реализован он будет
     * в классе Local, именно его и передаем при использовании класса ErrorInfo внутрь метода log
     */
    public void log(Log logger){
        logger.log("message" + message + "cause" + cause);
    }
}
