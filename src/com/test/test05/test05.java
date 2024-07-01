package com.test.test05;

public class test05 {
    public static void main(String[] args) {
        Worker john = new Worker(20000, "John");
        john.display();

        Teacher mary = new Teacher(50000, "Mary");
        mary.setClassDay(200);
        mary.setClassSal(100);
        mary.display();
    }
}
