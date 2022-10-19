package com.example.myapplication2.Java.lesson13;

import java.util.Objects;

public class CommandAndResult {
    private final String command;
    private final String result;

    public CommandAndResult(String command, String result){
        this.command = command;
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommandAndResult that = (CommandAndResult) o;
        return Objects.equals(command, that.command) && Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(command, result);
    }

    @Override
    public String toString() {
        return "CommandAndResult{" +
                "command='" + command + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
