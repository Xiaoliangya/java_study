package com.encap;

public class encap01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(25);
        person.setSalary(50000.0);
        String info = person.info();
        System.out.println(info);

        Person person1 = new Person("杨亮", 10000, 8888);
        System.out.println(person1.info());


    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
        this.name = name;
    } else {
            System.out.println("姓名长度不符合规范");
            this.name = "Unknown";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄不符合规范");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }
}