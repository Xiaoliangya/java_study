import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    recursion.test(5);
    }
}

class recursion{

    public static void test(int n){
        if(n>2){
            test(n-1);
        }

        System.out.println(n);
    }
 }