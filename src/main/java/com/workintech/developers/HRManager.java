package com.workintech.developers;

public class HRManager extends Employee{
    private String[] JuniorDeveloper;
    private String[] MidDeveloper;
    private String[] SeniorDeveloper;
    public HRManager(long id, String name, double salary){
        super(id,name,salary);
    }
    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
        setSalary(5000);
    }
    public void addEmployee(){

    }
    }
