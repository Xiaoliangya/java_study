package com.test.test03;

public class Worker extends employee {

    public Worker(String name, double salary_daily, int work_days, double level) {
        super(name, salary_daily, work_days, level);
    }

    @Override
    public void printsalary() {
        super.printsalary();
    }
    
}
