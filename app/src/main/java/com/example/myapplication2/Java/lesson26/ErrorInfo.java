package com.example.myapplication2.Java.lesson26;

public class ErrorInfo {
    private final String message;
    private final String cause;

    public ErrorInfo(String message, String cause) {
        this.message = message;
        this.cause = cause;
    }

    /**
     * Используем метод в интерфейсе? не поняла как
     *
     */
    public void log(Log logger){
        logger.log("message" + message + "cause" + cause);
    }
}
