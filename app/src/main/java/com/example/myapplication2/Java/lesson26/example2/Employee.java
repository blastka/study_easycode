package com.example.myapplication2.Java.lesson26.example2;

import androidx.annotation.NonNull;

public abstract class Employee implements TaskHandler{
    private final TaskProgressCallback callback;
    private final String name;
    private final Task.Status taskstatus;


    protected Employee(TaskProgressCallback callback, String name, Task.Status taskstatus) {
        this.callback = callback;
        this.name = name;
        this.taskstatus = taskstatus;
    }

    public boolean doTask(@NonNull Task task){
        boolean canHandle = taskstatus == task.getStatus();
        if (canHandle) {
            System.out.println(getClass().getSimpleName() + " " + name
                    + " id doing task " + getDetails(task));
            callback.updateTask(getTaskWhenDone(task));
        }
        return canHandle;
    }

    public boolean canHandle(Task task){
        return taskstatus == task.getStatus();
    }
    public Task.Status getTaskStatus(){
        return taskstatus;
    }

    protected abstract Task getTaskWhenDone(Task task);
    protected abstract String getDetails(Task task);
}
