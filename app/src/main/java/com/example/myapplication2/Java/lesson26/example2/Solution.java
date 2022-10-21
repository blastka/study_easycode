package com.example.myapplication2.Java.lesson26.example2;

public class Solution {
    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        TaskProgressCallback callback = new TaskProgressCallback() {
            @Override
            public void updateTask(Task task) {
                factory.updateTask(task);
            }
        };
        EmployeeChain chain = new EmployeeChain(
                new EmployeeChain(
                        new Designer(callback, "h"),
                        new Programmer(callback, "J")
                ),
                new Tester(callback, "S")
        );
        while (true) {
            if (!chain.doTask(factory.getTask()))
                break;
        }
    }
}
