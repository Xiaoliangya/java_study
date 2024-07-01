package com.test.test03;

public class Manage_ extends employee {

    private double bonus;

    //创建Manage对象时,奖金并不确定，因此在此构造器中不设置奖金属性
    public Manage_(String name, double salary_daily, int work_days, double level) {
        super(name, salary_daily, work_days, level);
    }

    @Override
    public void printsalary() {
        System.out.println(getName() + "的工资是" + (getSalary_daily() * getWork_days() * getLevel() + bonus));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}
