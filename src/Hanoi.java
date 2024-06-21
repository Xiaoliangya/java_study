public class Hanoi {
    public static void main(String[] args) {
        Tower t1 = new Tower();
        t1.move(4,'A','B','C');
    }
}


class Tower {
    //num表示要移动的个数，a,b,c表示三根杆
    public void move(int num,char a,char b,char c) {
        if (num == 1) {
            System.out.println( a + " to " + c);
        } else {
            //如果有多个盘，可以看成两个，最下面的和最上面的所有盘
            //先移动上面所有的盘到b，借助c
            move(num-1,a,c,b);
            System.out.println( a + " to " + c);
            move(num -1, b, a, c);
        }
    }
}