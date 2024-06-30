package com.test.polyparameter_;

public class Manage extends Employee {
    private int bonus;

    public Manage(String name, double mouthlysalary, int bonus) {
        super(name, mouthlysalary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println(getName() +"Managing the team");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus ;
    }
}
