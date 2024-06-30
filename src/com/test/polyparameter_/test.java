package com.test.polyparameter_;

public class test {
    public static void main(String[] args) {
        common_employee e1 = new common_employee("John", 25);
        Manage m1 = new Manage("Jane", 30, 6000);
        test test = new test();
        test.showEmpAnnual(e1);
        test.showEmpAnnual(m1);
    }

    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

}

