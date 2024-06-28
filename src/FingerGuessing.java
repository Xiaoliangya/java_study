import java.util.Random;
import java.util.Scanner;

public class FingerGuessing {
    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.VS();
        System.out.printf("Tom一共赢了%d次", tom.wins);
    }
}

class Tom {
    int Tomnum;
    int Comnum;
    int wins = 0;
    int count = 0;


    public void Comnum() {
        Random rand = new Random();
        int r = rand.nextInt(3);
        System.out.println("Computer出了" + r);
        Comnum = r;
    }

    public void Tomnum() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入0，1，2进行猜拳");
        int num = input.nextInt();
        if (num < 0 || num > 2) {
            System.out.println("输入错误，请重新输入");
        } else {
            Tomnum = num;
        }
    }

    public void VS(){
        do {
            this.Tomnum();
            this.Comnum();
            count++;
            System.out.println("Tom出了" + Tomnum + "，Computer出了" + Comnum);
        if (Tomnum == Comnum) {System.out.println("平局");}
        else if (Tomnum == 0 && Comnum == 2) {System.out.println("Tom赢了");wins++;}
        else if (Tomnum == 1 && Comnum == 0) {System.out.println("Tom赢了");wins++;}
        else if (Tomnum == 2 && Comnum == 1) {System.out.println("Tom赢了");wins++;}
        else {System.out.println("你输了");}
    }
    while (count < 3);
    }

}