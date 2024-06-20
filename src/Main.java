import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println(exercise.test(10));

    }
}

class exercise {
    public static int test(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        int result = arr[n - 1];
        return result;
    }

    public int monker_peach(int day){
        if (day == 10) {
            return 1;
        }
        else if (day >= 1 && day <= 9) {
            return (monker_peach(day)+1)*2;
        }
        else {
            return -1;
        }
    }

}


