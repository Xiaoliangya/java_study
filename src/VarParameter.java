public class VarParameter {
    public static void main(String[] args) {
        HspMethod hspMethod = new HspMethod();
        int result = hspMethod.sum(1, 2, 3, 4, 5);
        System.out.println(result);
    }
}

class HspMethod {
//    public int sum(int a, int b) {
//        return a + b;
//    }
//
//    public int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public int sum(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }

    public int sum(int... nums) {       //int...表示可变参数，类型是int，可以传入多个int参数（0个或多个）
        int sum = 0;                    //nums是一个int数组，可以用for-each循环遍历
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

}
