package com.example.myapplication2.Java.lesson26.example2;

public class EmployeeChain {
    private final Employee employee;
    private EmployeeChain nextEmployeeChain;

    public EmployeeChain(Employee employee) {
        this.employee = employee;
    }

    public boolean doTask(Task task) {
        if (task.getStatus() == employee.getTaskStatus()){
            employee.doTask(task);
            return true;
        } else if (nextEmployeeChain != null){
            return nextEmployeeChain.doTask(task);
        }else
            return false;
    }

    public void setNextEmployeeChain(EmployeeChain nextEmployeeChain){
        this.nextEmployeeChain = nextEmployeeChain;
    }

}
