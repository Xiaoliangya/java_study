package com.project_1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {

        //定义相关变量
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        //零钱通明细
        String details = "===============零钱通明细===============";

        //收益入账
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//设置日期格式

        //消费,定义字符串记录消费原因
        String reason = "";

        //菜单界面
        do {
            System.out.println("\n===============零钱通菜单===============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消   费");
            System.out.println("\t\t\t4 退   出");


            System.out.print("请输入选项(1-4):");
            key = scanner.next();

            switch (key) {
                case "1":
                    // 零钱通明细
                    System.out.println(details);
                    break;
                case "2":
                    // 收益入账
                    System.out.print("收益入账金额:");

                    //保证用户输入金额合理
                    money = scanner.nextDouble();  //money的值应该校验
                    while(money <= 0) {
                        System.out.println("收益金额应该大于0，请重新输入！");
                        money = scanner.nextDouble();
                    }
                    balance += money;

                    //拼接收益入账明细至details
                    date = new Date();
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    // 消费情况
                    System.out.print("消费金额:");
                    money = scanner.nextDouble();  //money的值应该校验
                    while(balance < money) {
                        System.out.println("余额不足，无法消费！");
                        System.out.print("消费金额:");
                        money = scanner.nextDouble();
                    }
                    while(money <= 0) {
                        System.out.println("消费金额应该大于0，请重新输入！");
                        System.out.print("消费金额");
                        money = scanner.nextDouble();
                    }
                    System.out.print("消费原因:");
                    reason = scanner.next();  //reason的值应该校验
                    balance -= money;

                    //拼接消费明细至details
                    date = new Date();
                    details += "\n" + reason + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    // 退出确认
                    System.out.println("你确定要退出吗？Y/N");

                    //保证用户输入正确y/n
                    String exit = scanner.next();
                    while(!exit.equals("Y") &&!exit.equals("N") && !exit.equals("y") && !exit.equals("n")) {
                        System.out.println("输入非法，请重新输入！y/n");
                        exit = scanner.next();
                    }

                    //y/n确认是否退出
                    if(exit.equals("Y") || exit.equals("y")) {
                    System.out.println("系统已退出");
                    loop = false;
                    } else {
                    System.out.println("继续使用零钱通！");
                    }
                    break;
                default:
                    System.out.println("输入非法，请重新输入！");
                    break;
            }
        } while (loop);
        System.out.println("欢迎下次使用零钱通！");
    }
}
