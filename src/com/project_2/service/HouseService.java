package com.project_2.service;

import com.project_2.domin.House;

/**
 * HouseService.java<=>类【业务层】
 * 定义House【】，保存House对象
 * 1. 响应HouseService的调用
 * 2.完成对房屋信息的增删改查
 */
public class HouseService {

    private House[] houses; //保存House对象
    private int houseNums = 1; //房屋数量
    private int idCounter = 1; //房屋id生成器

    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1, "jack", "10086", "开福区", 2000, "空闲");
    }

    public House[] list() {
        return houses;
    }

    //add house
    public boolean add(House newHouse) {
        //判断是否越界
        if (houseNums >= houses.length) {
            System.out.println("数组已满，不能添加...");
            return false;
        }

        houses[houseNums++] = newHouse;
        newHouse.setId(++idCounter);
        return true;
    }

    //delete house
    public boolean delete(int delId) {

        for (int i = 0; i < houseNums; i++) {
            if (houses[i].getId() == delId) {
                for (int j = i; j < houseNums - 1; j++) {
                    houses[j] = houses[j + 1];
                }
                houses[--houseNums] = null;
                return true;
            }
        }

        return false;
    }

    //find house
    public House findById(int findId) {
        for (int i = 0; i < houseNums; i++) {
            if (houses[i].getId() == findId) {
                return houses[i];
            }
        }
        return null;
    }



}

