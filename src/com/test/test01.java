package com.test;

public class test01 {
    public static void main(String[] args) {
        PC pc = new PC("i7", 8, 500, "HP");
        pc.printDetails();
    }
}


class Computer {
    private String cpu;
    private int ram;
    private int hdd;

    public Computer(String cpu, int ram, int hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getDetails() {
        return "CPU:" + cpu + "ram:" + ram + "hdd:" + hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = Integer.parseInt(hdd);
    }
}

class PC extends Computer {
    String brand;

    public PC(String cpu, int ram, int hdd, String brand) {
        super(cpu, ram, hdd);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printDetails() {
        System.out.println(getDetails() + "Brand:" + brand);
    }
}

class NotePad extends Computer {
    String color;

    public NotePad(String cpu, int ram, int hdd, String color) {
        super(cpu, ram, hdd);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printDetails() {
        System.out.println(getDetails() + "Color:" + color);
    }
}