package com.example.myapplication2.Java.lesson26.example2;

public class Tester extends Employee{
    protected Tester(TaskProgressCallback callback, String name, Task.Status taskstatus) {
        super(callback, name, Task.Status.READY_FOR_TESTING);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                task.getId(),
                Task.Status.DONE,
                task.getDescription(),
                getDesignLinkForTask(task.getId()),
                getTestCaseForTask(task.getDescription()),
                ""
        );
    }

    @Override
    protected String getDetails(Task task) {
        return " with taskId" + task.getId() + " and description " + task.getDescription();
    }

    private String getDesignLinkForTask(int taskId){
        return "https//" + taskId;
    }

    private String getTestCaseForTask(String taskDectiprion){
        return "when" + taskDectiprion + " get result" + Math.random();
    }
}
