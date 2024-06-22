
public class OverLoad {
    public static void main(String[] args) {
        Methods m = new Methods();
        System.out.println(m.max(4, 1, 2));
    }
}

class Methods {
    public void m(int a) {
        System.out.println(a * a);
    }

    public void m(int a, int b) {
        System.out.println(a * b);
    }

    public void m(String str) {
        System.out.println(str);
    }

    public int max(int n1, int n2) {
        if (n1 >= n2) {
            return n1;
        } else {
            return n2;
        }
    }

    public double max(double n1, double n2) {
        if (n1 >= n2) {
            return n1;
        } else {
            return n2;
        }
    }

    public double max(double n1, double n2, double n3) {
        double arr[] = new double[3];
        arr[0] = n1;
        arr[1] = n2;
        arr[2] = n3;
        double max = n1;
        for (int i = 0; i < 3; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }
}

