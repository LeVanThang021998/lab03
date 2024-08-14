/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.baitap02;

import java.text.DecimalFormat;

/**
 *
 * @author ADMIN
 */
public class ChuongTrinh {

    public static void main(String[] args) {
        Account ac1, ac2;

        DecimalFormat fmt = new DecimalFormat("#,##0");
        //tao doi tuong acc 1: thong tin chinh minh
        ac1 = new Account("AC001", "Le Van Thang", 150000000);

        //tao doi tuong acc 2: thong tin ban than
        ac2 = new Account("AC002", "Le Van Luyen", 150000000);

        System.out.println("-----THONG TIN TAI KHOAN BAN DAU-----");
        System.out.println("My Account: id:" + ac1.getId() + " - name:" + ac1.getName() + " - " + fmt.format(ac1.getBalance()));
        System.out.println("Myfriend Account: id:" + ac2.getId() + " - name:" + ac2.getName() + " - " + fmt.format(ac2.getBalance()));

        ac1.credit(50000000);
        ac2.debit(80000000);

        System.out.println("-----THONG TIN TAI KHOAN SAU GIAO DICH RUT, GUI TIEN-----");
        System.out.println("My Account: id:" + ac1.getId() + " - name:" + ac1.getName() + " - " + fmt.format(ac1.getBalance()));
        System.out.println("Myfriend Account: id:" + ac2.getId() + " - name:" + ac2.getName() + " - " + fmt.format(ac2.getBalance()));

        ac1.tranferTo(ac2, 500000);

        System.out.println("-----THONG TIN TAI KHOAN SAU GIAO DICH CHUYEN KHOAN-----");
        System.out.println("My Account: id:" + ac1.getId() + " - name:" + ac1.getName() + " - " + fmt.format(ac1.getBalance()));
        System.out.println("Myfriend Account: id:" + ac2.getId() + " - name:" + ac2.getName() + " - " + fmt.format(ac2.getBalance()));
    }
}
