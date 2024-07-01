package com.test.test03;

public class Professor extends teacher {

    public Professor(String name, int age, String post, double salary, double level) {
        super(name, age, post, salary, level);
    }

    @Override
    public void introduce() {
        System.out.println("这是一位教授的介绍。");
        super.introduce();
    }

}

