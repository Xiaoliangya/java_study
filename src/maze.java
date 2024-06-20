public class maze {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        map[3][1] = 1;
        map[3][2] = 1;

        System.out.println("====maze map:====");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        T t=new T();
        t.findway(map,1,1);
        System.out.println("====find way:====");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }
}
/*
* 找到通路会返回true，否则返回false
* map即二维数组，也是迷宫地图，1表示墙，0表示通路
* i，j表示老鼠所在的位置，初始为（1，1）
* 0表示可以走，1表示墙，2表示可以走的的路，3表示已经走过的路，但是走不通的路
* 当map[6][5]为2时，表示找到通路，可以返回true
* 找路策略：下->右->上->左
*/
class T{
    public boolean findway(int[][] map,int i,int j) {
        if(map[6][5]==2) {
            return true;
        }else{
            if(map[i][j]==0){ //表示当前坐标可以走
                //假定可以走通
                map[i][j]=2;
                if(findway(map,i+1,j)) {
                    return true;
                }else if(findway(map,i,j+1)) {
                    return true;
                }else if(findway(map,i-1,j)) {
                    return true;
                }else if(findway(map,i,j-1)) {
                    return true;
                }else{
                    //都不行，说明走不通，回退
                    map[i][j]=3;
                    return false;
                }
            }else{
                return false;
            }
        }
    }
}
