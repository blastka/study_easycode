package com.example.myapplication2.Java.lesson26.example2;

public class Designer extends Employee{
    protected Designer(TaskProgressCallback callback, String name, Task.Status taskstatus) {
        super(callback, name, Task.Status.ASSEMBLING_REQUIREMENTS);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                task.getId(),
                Task.Status.READY_TO_DO,
                task.getDescription(),
                getDesignLinkForTask(task.getId()),
                getTestCaseForTask(task.getDescription()),
                ""
        );
    }

    @Override
    protected String getDetails(Task task) {
        return " with taskId" + task.getId() + "and description" + task.getDescription();
    }

    /**
     * Прям напрашивается на вынос в интерфейс
     */
    private String getDesignLinkForTask(int taskId){
        return "https//" + taskId;
    }

    private String getTestCaseForTask(String taskDescription){
        return "when " + taskDescription + " get result " + Math.random();
    }
}