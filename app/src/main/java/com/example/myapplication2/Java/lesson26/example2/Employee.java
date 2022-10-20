package com.example.myapplication2.Java.lesson26.example2;

public abstract class Employee {
    private final TaskProgressCallback callback;
    private final String name;
    private final Task.Status taskstatus;


    protected Employee(TaskProgressCallback callback, String name, Task.Status taskstatus) {
        this.callback = callback;
        this.name = name;
        this.taskstatus = taskstatus;
    }

    public void doTask(Task task){
        System.out.println(getClass().getSimpleName() + " " + name
        + " id doing task " + getDetails(task));
        callback.updateTask(getTaskWhenDone(task));
    }

    public Task.Status getTaskStatus(){
        return taskstatus;
    }

    protected abstract Task getTaskWhenDone(Task task);
    protected abstract String getDetails(Task task);
}
