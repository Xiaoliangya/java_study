package com.project_2.view;

import com.project_2.domin.House;
import com.project_2.service.HouseService;
import com.project_2.utils.Utility;

/**
 * 1.显示界面
 * 2.接收用户输入
 * 3.调用HouseService进行处理
 */
public class HouseView {

    private boolean loop = true; //控制菜单显示
    private char key = ' ';      //接收用户选择
    private HouseService houseservice = new HouseService(10); //数组大小为10

    //显示主菜单
    public void mainMenu() {

        do {
            System.out.println("=================房屋出租系统=================");
            System.out.println("\t\t\t 1 新 增 房 源");
            System.out.println("\t\t\t 2 查 找 房 屋");
            System.out.println("\t\t\t 3 删 除 房 屋");
            System.out.println("\t\t\t 4 修 改 房 屋 信 息");
            System.out.println("\t\t\t 5 显 示 房 屋 信 息");
            System.out.println("\t\t\t 6 退 出 系 统");
            System.out.println("===========================================");
            System.out.print("请输入选项(1-6):");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    deleteHouse();
                    break;
                case '4':
                    update();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
                default:
                    System.out.println("输入错误，请重新输入！");
                    break;
            }
        } while (loop);
    }

    //显示房屋信息
    public void listHouses() {
        System.out.println("\n==================房屋列表==================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(空闲/出租)");
        House[] houses = houseservice.list();//获取房屋列表
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("===============房屋列表显示完成===============\n");
    }

    //增加房屋信息
    public void addHouse() {
        System.out.println("\n==================添加房屋==================");
        System.out.print("姓名:");
        String name = Utility.readString(8);
        System.out.print("电话:");
        String phone = Utility.readString(11);
        System.out.print("地址:");
        String address = Utility.readString(16);
        System.out.print("月租:");
        int rent = Utility.readInt();
        System.out.print("状态:");
        String status = Utility.readString(3);
        //创建一个新的房屋对象,注意id由系统分配
        House newHouse = new House(0, name, phone, address, rent, status);
        if (houseservice.add(newHouse)) {
            System.out.println("=================添加房屋成功=================\n");
        } else {
            System.out.println("=================添加房屋失败=================\n");
        }
    }

    //删除房屋信息
    public void deleteHouse() {
        System.out.println("\n=================删除房屋信息==================");
        listHouses();
        System.out.print("请输入待删除房屋编号(-1退出):");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("===============放弃删除房屋信息================\n");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            if (houseservice.delete(delId)) {
                System.out.println("=================删除房屋成功=================\n");
            } else {
                System.out.println("=============编号不存在，删除房屋失败============\n");
            }
        } else {
            System.out.println("===============放弃删除房屋信息================\n");
        }

    }

    //退出系统
    public void exit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }

    //查找房屋信息
    public void findHouse() {
        System.out.println("\n=================查找房屋信息==================");
        System.out.print("请输入要查找的id:");
        int findId = Utility.readInt();
        House house = houseservice.findById(findId);

        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("=================房屋信息不存在================\n");
        }
    }


    //修改房屋信息
    public void update() {
        System.out.println("\n=================修改房屋信息=================");
        System.out.print("请选择待修改房屋编号（-1退出）:");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("===============放弃修改房屋信息================\n");
            return;
        }

        House house = houseservice.findById(updateId);//引用类型
        if (house == null) {
            System.out.println("=================房屋信息不存在================\n");
            return;
        }

        //修改姓名
        System.out.print("姓名(" + house.getName() + "):");
        String name = Utility.readString(8, "");
        if (!name.equals("")) {
            house.setName(name);
        }

        //修改电话
        System.out.print("电话(" + house.getPhone() + "):");
        String phone = Utility.readString(11,"");
        if (!phone.equals("")) {
            house.setPhone(phone);
        }

        //修改地址
        System.out.print("地址(" + house.getAddress() + "):");
        String address = Utility.readString(16,"");
        if (!address.equals("")) {
            house.setAddress(address);
        }

        //修改月租
        System.out.print("月租(" + house.getRent() + "):");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }

        //修改状态
        System.out.print("状态(" + house.getState() + "):");
        String status = Utility.readString(3, "");
        if (!status.equals("")) {
            house.setState(status);
        }

        System.out.println("=================修改房屋信息成功=================\n");

    }
}

