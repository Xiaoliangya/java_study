public class TestCalculator {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        System.out.println(calculator.calculate(2, 3)); // expected output: 5
        System.out.println(calculator.calculate(2, 3.0)); // expected output: 5.0
        System.out.println(calculator.calculate(2.0, 3));
        System.out.println(calculator.calculate(2, 3, 4));
    }
}

class MyCalculator {
    public int calculate(int a, int b) {
        return a + b;
    }

    public double calculate(int a, double b) {
        return a + b;
    }

    public double calculate(double a, int b) {
        return a + b;
    }

    public int calculate(int a, int b, int c) {
        return a + b + c;
    }

}