package com.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("张三", 100, "123456");
        account.setBalance(2100);
        account.info();

    }
}

// * Account 类要求具有属性：姓名（长度为 2 位 3 位或 4 位）、余额(必须>20)、
// * 密码（必须是六位）, 如果不满足，则给出提示信息，并给默认值(程序员自己定)
// * 通过 setXxx 的方法给Account 的属性赋值。
// * 在AccountTest 中测试
class Account {
    public String name;
    private double balance;
    private String pwd;

    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        setName(name);
        setBalance(balance);
        setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 2 || name.length() > 4) {
            System.out.println("姓名长度必须为 2 位 3 位或 4 位");
        } else {
            this.name = name;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance <= 20) {
            System.out.println("余额必须大于 20");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() != 6) {
            System.out.println("密码必须是六位");
            this.pwd = "000000";
        } else {
            this.pwd = pwd;
        }
    }

    public void info () {
        System.out.println("姓名：" + name + " 余额：" + balance + " 密码：" + pwd);
    }
}