package com.test;

public class test02 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];

        persons[0] = new Person("John", 25, "Engineer");
        persons[1] = new Person("Mary", 30, "Doctor");
        persons[2] = new Person("Tom", 20, "Teacher");

        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getAge() > persons[j + 1].getAge()) {
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
        for (Person person : persons) {
            System.out.println(person.getName() + "\t" + person.getAge() + "\t" + person.getJob());
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}


//public都可以访问；protected可以在通同类、子类、同包中访问；private只能在本类中访问；默认可以在同包、同类中访问


