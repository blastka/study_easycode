package com.example.myapplication2.Java.lesson26.example2;

import org.jetbrains.annotations.NotNull;

public class TaskFactory {

    private static final int SIZE = 10;
    private final Task[] tasks;

    /**
     * Создаем массив из 10 Task, который заполняем номером, статусом, и пустыми данными
     */
    public TaskFactory() {
        tasks = new Task[SIZE];
        for (int i = 0; i < SIZE; i++){
            tasks[i] = new Task(i, Task.Status.ASSEMBLING_REQUIREMENTS,
                    "" + i, "", "", "");
        }
    }

    /**
     * Метод получения тасок, сначала создаем одну таску "результат" и заполняем нулом
     * в цикле проходимся по существующим таскам, и если статус таски не Done, то
     * присваиваем "результату" таску, выходим из цикла. Далее проверяем не равна ли таска
     * нулу, если равна присваиваем первую из массива существующих тасок.
     *
     * @return
     */
    @NotNull
    public Task getTask(){
        Task result = null;
        for(Task task : tasks){
            if (task.getStatus() != Task.Status.DONE){
                result = task;
                break;
            }
        }
        if (result == null){
            result  = tasks[0];
        }
        return result;
    }

    /**
     * Входящий аргумент одна таска. В цикле проходимся по массиву тасок, если id из массива
     * равен id входящей таски, то присваиваем ее к ней (типа перезаписали)
     * @param task
     */
    public void updateTask(Task task){
        for (int i = 0; i < SIZE; i++){
            if (tasks[i].getId() == task.getId()){
                tasks[i] = task;
                break;
            }
        }
    }
}
