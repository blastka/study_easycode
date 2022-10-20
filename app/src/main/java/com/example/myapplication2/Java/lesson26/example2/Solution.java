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
        EmployeeChain chain = new EmployeeChain(new Designer(callback, "Al"));
        EmployeeChain next = new EmployeeChain(new Programmer(callback, "J"));
        EmployeeChain last = new EmployeeChain(new Tester(callback, "St"));
        next.setNextEmployeeChain(last);
        chain.setNextEmployeeChain(next);
        while (true){
            chain.doTask(factory.getTask());
        }
    }
}
