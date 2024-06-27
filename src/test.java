public class test {
    public static void main(String[] args) {
//        Grade g = new Grade();
//        g.print_grade("张三", 80, 90);
//        g.print_grade("李四", 70, 80, 90, 20, 20);
        Person p = new Person();
        System.out.println(p.age);
        Person p1 = new Person("李四", 20);
        System.out.println(p1.name+" "+p1.age);
    }
}

class Grade {
    public void print_grade(String name, int...grade) {
        double total = 0;
        for (int i = 0; i < grade.length; i++){
            total += grade[i];
        }
        System.out.println(name + " 总分:" + total);
    }
}

class Person {
    String name;
    int age;

    public Person(){
        age = 18;
    }

    public Person(String pName, int pAge ){
        name = pName;
        age = pAge;
    }
}