public class test {
    public static void main(String[] args) {
//        Grade g = new Grade();
//        g.print_grade("张三", 80, 90);
//        g.print_grade("李四", 70, 80, 90, 20, 20);
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