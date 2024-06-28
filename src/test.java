public class test {
    public static void main(String[] args) {
//        Grade g = new Grade();
//        g.print_grade("张三", 80, 90);
//        g.print_grade("李四", 70, 80, 90, 20, 20);

//        Person p = new Person();
//        System.out.println(p.age);
//        Person p1 = new Person("李四", 20);
//        System.out.println(p1.name+" "+p1.age);

//        Person p1 = new Person("张三", 20);
//        Person p2 = new Person("李四", 35);
//        System.out.println(p1.CompareTo(p2));
        Circle c = new Circle();
        PassObject po = new PassObject(5);
        po.printAreas(c, 5);
    }
}

class Grade {
    public void print_grade(String name, int... grade) {
        double total = 0;
        for (int i = 0; i < grade.length; i++) {
            total += grade[i];
        }
        System.out.println(name + " 总分:" + total);
    }
}

class Person {
    String name;
    int age;

    public Person() {
        age = 18;
    }

    public Person(String Name, int Age) {
        this.name = Name;
        this.age = Age;
    }

    public boolean CompareTo(Person p) {
        if (this.name.equals(p.name) && this.age == p.age) return true;
        else return false;
    }
}

class A01 {
    public double max(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
}

class A02 {
    public int find(char[] arr, char c) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) return i;
        }
        return -1;
    }

    public int find(String findstr, String[] str){
        for (int i = 0; i < str.length; i++){
            if (str[i].equals(findstr)) return i;
        }
        return -1;
    }
}

class Book {
    double price;
    String name;

    public Book(String name, double price) {
        this.price = price;
        this.name = name;
    }

    public void updatePrice() {
        if (this.price > 150) {
            this.price = 150;
        } else if (this.price > 100) {
            this.price = 100;
        }
    }
}

class A03 {
    public void copy(int[] arr) {
        int[] arrnew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrnew[i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < arrnew.length; i++) {
            System.out.print(arrnew[i] + "\t");
        }
    }
}

class Circle {
    double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class Cale {
    int a;
    int b;

    public Cale(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }

    public int sub() {
        return a - b;
    }

    public int mul() {
        return a * b;
    }

    public int div() {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }
}

class Dog {
    String name;
    int age;
    String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void showInfo() {
        System.out.println("名字：" + name + " 年龄：" + age + " 颜色：" + color);
    }
}

class music {
    String name;
    double times;

    public music(String name, double times) {
        this.name = name;
        this.times = times;
    }

    public void play() {
        System.out.println("正在播放：" + name + " 时间：" + times + " 分钟");
    }

}

class Employee {
    String name;
    int age;
    char gender;
    String position;
    double salary;

    public Employee(String name, int age, char gender, String position, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, int age, char gender) {

        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Employee(String position, double salary) {
        this.position = position;
        this.salary = salary;
    }

}

class PassObject {
    int times;

    public PassObject(int times) {
        this.times = times;
    }

    public void printAreas(Circle c, int times) {
        System.out.println("Radius"+"\t"+"Area");
        for (int i = 1; i <= times; i++) {
            c.setRadius(i);
            System.out.println(i + "\t" + c.getArea());
        }
    }
}

