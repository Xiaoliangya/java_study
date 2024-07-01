package com.test.test03;

public class test03 {
    public static void main(String[] args) {
        Professor professor = new Professor("John", 30, "professor", 20000, 1.1);
        professor.introduce();

        Manage_ john = new Manage_("John", 100, 20, 1.2);
        john.setBonus(3000);
        john.printsalary();
    }
}
