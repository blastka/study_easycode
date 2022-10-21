package com.example.myapplication2.Java.lesson26.example2;

public class EmployeeChain implements TaskHandler{
    private final TaskHandler first;
    private final TaskHandler second;

    public EmployeeChain(TaskHandler first, TaskHandler second) {
        this.first = first;
        this.second = second;
    }


    public boolean doTask(Task task) {
        boolean result;
        result = first.doTask(task);
        System.out.println("doTask result " + result);
        if (!result){
            result = second.doTask(task);
            System.out.println("doTask !result " + result);
        }
        return result;
    }

}
